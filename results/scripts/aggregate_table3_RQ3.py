import os
import pandas as pd
from pathlib import Path

# ===============================
# Helpers
# ===============================

def split_first_n_commas(line: str, n: int):
    """Retorna os índices das primeiras n vírgulas não escapadas (',' não precedidas por '\\')."""
    idxs = []
    prev = ''
    for i, ch in enumerate(line):
        if ch == ',' and prev != '\\':
            idxs.append(i)
            if len(idxs) == n:
                break
        prev = ch
    return idxs

def robust_read_violation_csv_first5(csv_path):
    """
    Faz o parse de CSV onde a última coluna (log) pode conter muitas vírgulas.
    Captura só as 5 primeiras colunas: id, Project, Filename, Specification, Conclusion.
    """
    rows = []
    with open(csv_path, "r", encoding="utf-8", errors="ignore") as f:
        header = next(f, None)  # pula header
        for raw in f:
            raw = raw.rstrip("\n").rstrip("\r")
            if not raw.strip():
                continue
            idxs = split_first_n_commas(raw, 5)  # 6 campos -> pegamos os 5 primeiros
            if len(idxs) < 5:
                # tenta com 4 vírgulas (linhas sem log)
                idxs = split_first_n_commas(raw, 4)
                if len(idxs) < 4:
                    continue  # linha malformada
                s0 = raw[:idxs[0]]
                s1 = raw[idxs[0]+1:idxs[1]]
                s2 = raw[idxs[1]+1:idxs[2]]
                s3 = raw[idxs[2]+1:idxs[3]]
                s4 = raw[idxs[3]+1:]
                fields = [s0, s1, s2, s3, s4]
            else:
                s0 = raw[:idxs[0]]
                s1 = raw[idxs[0]+1:idxs[1]]
                s2 = raw[idxs[1]+1:idxs[2]]
                s3 = raw[idxs[2]+1:idxs[3]]
                s4 = raw[idxs[3]+1:idxs[4]]  # Conclusion
                fields = [s0, s1, s2, s3, s4]
            fields = [x.strip().strip('"').strip("'") for x in fields]
            rows.append(fields)
    return pd.DataFrame(rows, columns=["id","Project","Filename","Specification","Conclusion"])

def normalize_truebug(s: str) -> bool:
    """Detecta True Positive pelo campo Conclusion (aceita variações/typos comuns)."""
    s = str(s).strip().lower()
    return (
        "truebug" in s or
        "true bug" in s or
        s == "tb" or
        "truebog" in s or       # typo observado
        "true-bug" in s or
        "true_bug" in s
    )

def compute_tp_from_violations(df: pd.DataFrame) -> int:
    """Conta TPs (raw) sem ajuste final +1."""
    return df["Conclusion"].apply(normalize_truebug).sum()

def read_fp_fn(fp_path, fn_path):
    df_fp = pd.read_csv(fp_path)
    df_fn = pd.read_csv(fn_path)

    # normaliza headers
    df_fp.columns = [c.strip().replace(" ", "_") for c in df_fp.columns]
    df_fn.columns = [c.strip().replace(" ", "_") for c in df_fn.columns]

    def find_approach_col(df):
        for c in df.columns:
            vals = df[c].astype(str).str.strip().str.upper().unique().tolist()
            if any(v in ("JAVAMOP", "SIESTA", "MSL") for v in vals):
                return c
        return df.columns[0]

    col_fp = find_approach_col(df_fp)
    col_fn = find_approach_col(df_fn)

    # mantém só linhas válidas
    df_fp = df_fp[df_fp[col_fp].astype(str).str.strip().str.lower().isin(["javamop", "siesta", "msl"])]
    df_fn = df_fn[df_fn[col_fn].astype(str).str.strip().str.lower().isin(["javamop", "siesta", "msl"])]

    def norm_app(s):
        s = str(s).strip().upper()
        return "SIESTA" if s in ("SIESTA", "MSL") else "JavaMOP"

    fp_counts = df_fp[col_fp].map(norm_app).value_counts().to_dict()
    fn_counts = df_fn[col_fn].map(norm_app).value_counts().to_dict()

    for k in ("JavaMOP","SIESTA"):
        fp_counts.setdefault(k, 0)
        fn_counts.setdefault(k, 0)

    return fp_counts, fn_counts

def calc_metrics(tp, fp, fn):
    prec = tp / (tp + fp) if (tp + fp) > 0 else 0.0
    rec  = tp / (tp + fn) if (tp + fn) > 0 else 0.0
    f1   = (2 * prec * rec) / (prec + rec) if (prec + rec) > 0 else 0.0
    return prec, rec, f1

def fmt_pct(x): return f"{x*100:.2f}%"

# ===============================
# 0) Caminhos
# ===============================
BASE = Path(r"C:\UFPE\Siesta\rep\JSS\results\data")
DFP_PATH  = BASE / "data_false_positive.csv"
DFN_PATH  = BASE / "data_false_negative.csv"

SIESTA_PATH  = BASE / "violation_siesta.csv"
JAVAMOP_PATH = BASE / "violation_javamop.csv"

OUT_CSV = BASE / "Table3_Results_FP_FN_with_Recall_and_F1_Score.csv"

# Validação de existência (falha clara se faltar)
for p in [DFP_PATH, DFN_PATH, SIESTA_PATH, JAVAMOP_PATH]:
    if not os.path.isfile(p):
        raise FileNotFoundError(f"Arquivo não encontrado: {p}")

# ===============================
# 1) Ler FP/FN
# ===============================
fp_counts, fn_counts = read_fp_fn(DFP_PATH, DFN_PATH)

# ===============================
# 2) Ler violações e contar TP (raw)
# ===============================
mop_df = robust_read_violation_csv_first5(JAVAMOP_PATH)
sie_df = robust_read_violation_csv_first5(SIESTA_PATH)

tp_mop_raw = compute_tp_from_violations(mop_df)
tp_sie_raw = compute_tp_from_violations(sie_df)

# ===============================
# 3) Ajuste “+1 simples no final”, como você pediu
# ===============================
#tp_mop = tp_mop_raw + 1
#tp_sie = tp_sie_raw + 1

# ===============================
# 4) Métricas e Tabela 3
# ===============================
mop_prec, mop_rec, mop_f1 = calc_metrics(tp_mop_raw, fp_counts["JavaMOP"], fn_counts["JavaMOP"])
sie_prec, sie_rec, sie_f1 = calc_metrics(tp_sie_raw, fp_counts["SIESTA"], fn_counts["SIESTA"])

table3 = pd.DataFrame({
    "Metric": ["False Positive (FP)", "False Negative (FN)", "Recall", "F1-Score", "Total"],
    "JavaMOP": [
        fp_counts["JavaMOP"],
        fn_counts["JavaMOP"],
        fmt_pct(mop_rec),
        fmt_pct(mop_f1),
        fp_counts["JavaMOP"] + fn_counts["JavaMOP"]
    ],
    "SIESTA": [
        fp_counts["SIESTA"],
        fn_counts["SIESTA"],
        fmt_pct(sie_rec),
        fmt_pct(sie_f1),
        fp_counts["SIESTA"] + fn_counts["SIESTA"]
    ]
})

table3.to_csv(OUT_CSV, index=False)

print("Table3_path", OUT_CSV)
