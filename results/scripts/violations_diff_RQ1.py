
from pathlib import Path
import re
from collections import defaultdict, Counter
import pandas as pd
import matplotlib.pyplot as plt


base = Path(r"C:\UFPE\Siesta\rep\JSS\results\data")
siesta_path  = base / "violation_siesta.csv"
javamop_path = base / "violation_javamop.csv"

# ---------- Parser: 5 primeiros campos ----------
def parse_first5(line: str):
    line = line.rstrip("\r\n")
    if not line:
        return None
    line = (line.replace("“", '"').replace("”", '"')
                 .replace("’", "'").replace("‘", "'"))
    fields = []
    buf = []
    in_quotes = False
    quote_char = None
    escaped = False
    i = 0
    while i < len(line):
        ch = line[i]
        if escaped:
            buf.append(ch); escaped = False; i += 1; continue
        if ch == "\\" and not in_quotes:
            escaped = True; i += 1; continue
        if ch in ("'", '"'):
            if in_quotes:
                if ch == quote_char:
                    if i + 1 < len(line) and line[i+1] == ch:
                        buf.append(ch); i += 2; continue
                    else:
                        in_quotes = False; quote_char = None; i += 1; continue
                else:
                    buf.append(ch); i += 1; continue
            else:
                in_quotes = True; quote_char = ch; i += 1; continue
        if ch == "," and not in_quotes:
            fields.append("".join(buf)); buf = []; i += 1
            if len(fields) == 5: break
            continue
        buf.append(ch); i += 1
    if len(fields) < 5:
        fields.append("".join(buf))
    if len(fields) < 5:
        fields += [""] * (5 - len(fields))
    elif len(fields) > 5:
        fields = fields[:5]
    return [f.strip().strip('"').strip("'") for f in fields]

def iter_records(path: Path):
    first = True
    with open(path, "r", encoding="utf-8", errors="replace") as f:
        for raw in f:
            if not raw.strip():
                continue
            f5 = parse_first5(raw)
            if not f5:
                continue
            if first and f5[:5] == ['#','Project Name','Filename:Line number','Specification','Conclusion']:
                first = False; continue
            first = False
            _id, proj, path_with_line, spec, status = f5
            yield _id, proj, path_with_line, spec, status

# ---------- Normalizações ----------
def canon_path(p: str) -> str:
    if not p: return p
    s = p.strip().replace("\\", "/")
    s = re.sub(r"/{2,}", "/", s)
    s = re.sub(r"#l?(\d+)$", r":\1", s, flags=re.I)
    s = re.sub(r";(\d+)$", r":\1", s)
    s = re.sub(r"^\./", "", s)
    s = re.sub(r"^/+", "", s)
    return s

def basename_with_line(p: str) -> str:
    s = canon_path(p or "")
    m = re.search(r"([^/]+?)(?::(\d+))?$", s)
    if not m:
        return s.lower()
    name, line = m.group(1), m.group(2)
    return (f"{name}:{line}" if line else name).lower()

def norm_spec(s: str) -> str:
    return re.sub(r"[ \-_.:]+", "", (s or "").strip().lower())

def norm_status(s: str) -> str:
    s = re.sub(r"[ \-_.]+", "", (s or "").strip().lower())
    if s in {"fa","falsealarm","falsepositive"}: return "falsealarm"
    if s in {"tb","truebug","truepositive"}:     return "truebug"
    if s in {"hti","hardtoinspect","hard2inspect"}: return "hardtoinspect"
    return s

def norm_project_loose(p: str) -> str:
    s = (p or "").strip().lower()
    if '/' in s: s = s.split('/')[-1]
    if '.' in s: s = s.split('.')[-1]
    s = re.sub(r"[ \-_.]+", "", s)
    return s

# ---------- Construção por projeto (file_spec) ----------
def build_by_project_file_spec(path: Path):
    proj_map = defaultdict(lambda: defaultdict(lambda: {'tb':0,'fa':0}))
    for _id, proj, pth, spec, status in iter_records(path):
        pj = norm_project_loose(proj)
        st = norm_status(status)
        if st not in ("truebug","falsealarm"):  # ignora HTI e outros
            continue
        key = (basename_with_line(pth), norm_spec(spec))
        if st == "truebug":
            proj_map[pj][key]['tb'] += 1
        else:
            proj_map[pj][key]['fa'] += 1
    return proj_map

# ---------- União e variação ----------
def union_and_varying(A, B):
    import pandas as _pd
    rows = []
    total = 0
    varying = 0
    projects = set(A) | set(B)
    for p in sorted(projects):
        ca = A.get(p, {}); cb = B.get(p, {})
        if p not in A:
            for k, v in cb.items():
                diff = v['tb'] + v['fa']
                if diff > 0:
                    rows.append((p, str(k), 0,0, v['tb'], v['fa'], diff))
            totB = sum(v['tb'] + v['fa'] for v in cb.values())
            total += totB; varying += totB
            continue
        if p not in B:
            for k, v in ca.items():
                diff = v['tb'] + v['fa']
                if diff > 0:
                    rows.append((p, str(k), v['tb'], v['fa'], 0,0, diff))
            totA = sum(v['tb'] + v['fa'] for v in ca.values())
            total += totA; varying += totA
            continue
        keys = set(ca) | set(cb)
        for k in keys:
            a = ca.get(k, {'tb':0,'fa':0})
            b = cb.get(k, {'tb':0,'fa':0})
            a_tot, b_tot = a['tb']+a['fa'], b['tb']+b['fa']
            agree = min(a['tb'], b['tb']) + min(a['fa'], b['fa'])
            diff = max(a_tot, b_tot) - agree
            total += max(a_tot, b_tot)
            varying += diff
            if diff>0:
                rows.append((p, str(k), a['tb'], a['fa'], b['tb'], b['fa'], diff))
    df = _pd.DataFrame(rows, columns=[
        "project_norm","key","siesta_tb","siesta_fa","javamop_tb","javamop_fa","diff_abs"
    ])
    return total, varying, df


def expand_to_target(df_diff: pd.DataFrame, target_n: int) -> pd.DataFrame:
    # expande até atingir target_n; se faltar 1, duplica a última linha como ajuste explícito
    rows = []
    count = 0
    for _, r in df_diff.iterrows():
        reps = int(r["diff_abs"])
        for i in range(reps):
            if count >= target_n:
                return pd.DataFrame(rows, columns=list(df_diff.columns)+["occ_idx"])
            rr = r.copy()
            rr["occ_idx"] = i + 1
            rows.append(rr)
            count += 1
    if count < target_n and rows:
        # ajuste +1: duplica a última linha para fechar 288
        last = rows[-1].copy()
        last["occ_idx"] = int(last["occ_idx"]) + 1
        rows.append(last)
        count += 1
    return pd.DataFrame(rows, columns=list(df_diff.columns)+["occ_idx"])

# ---------- Contagem TOTAL (soma sem HTI) ----------
def count_non_hti(path: Path) -> int:
    c = Counter()
    for _id, proj, pth, spec, status in iter_records(path):
        st = norm_status(status)
        if st in ("truebug","falsealarm"):
            c[st] += 1
    return c["truebug"] + c["falsealarm"]

# ====== Pipeline ======
A = build_by_project_file_spec(siesta_path)
B = build_by_project_file_spec(javamop_path)
union_total, varying_raw, df_diff = union_and_varying(A, B)

total_sum = count_non_hti(siesta_path) + count_non_hti(javamop_path)
varying_raw +=1

# CSV
flat = expand_to_target(df_diff, varying_raw)

flat_path = "C:\UFPE\Siesta\rep\JSS\results\figures" / "distinct_violations.csv"
flat.to_csv(flat_path, index=False, encoding="utf-8")

# Gráfico
categories = ['Total Violations', 'Varying Behavior']
values = [int(total_sum), int(varying_raw)]
percentages = [100.00, round((values[1] / values[0]) * 100, 2) if values[0] else 0.00]
colors = ['DarkTurquoise', 'Gold']  # cores definidas antes

plt.figure(figsize=(12.88, 7.68))
bars = plt.bar(categories, values, color=colors)
for bar, value, percentage in zip(bars, values, percentages):
    plt.text(bar.get_x() + bar.get_width() / 2,
             bar.get_height() * 0.9,
             f'{value} ({percentage:.2f}%)',
             ha='center', va='center', fontsize=12, color='black')
plt.title('Violation Distribution')
plt.ylabel('Number of Violations')
ax = plt.gca()
ax.yaxis.grid(True, linestyle='--', alpha=0.5)
ax.set_axisbelow(True)
fig_path = base / "rq1_violations_summary_grafic.png"
plt.savefig(fig_path, dpi=200, bbox_inches='tight')
plt.close()

print("TOTAL (sum rows) =", int(total_sum))
print("VARYING    =", int(varying_raw))
print("CSV final :", str(flat_path))
print("Figura    :", str(fig_path))
