# make_table2_in_order.py
from __future__ import annotations
from pathlib import Path
import pandas as pd

# === CONFIG ===
BASE = Path("C:/UFPE/Siesta/rep/JSS/results/data")  # <- ajuste se quiser
F_MSL   = BASE / "violation_siesta.csv"
F_JMOP  = BASE / "violation_javamop.csv"
F_FMT   = BASE / "table2_tb_fa_by_project_formatted.csv"   # gerado se não existir
F_OUT   = BASE / "table2_tb_fa_by_project.csv"      # saída final (ordenada)

# ordem alvo (case-insensitive, ignorando '.', '-', '_', e espaços)
TARGET_ORDER = [
    "joda-time",
    "apache.avro",
    "gae-java-mini-profiler",
    "oauth2.0providerforjava",
    "lucene-interval-fields",
    "recrack.kornakapi",
    "connector4java",
    "apache.gora",
    "com.greplin.zookeeper",
    "cassandracompositetype",
    "codahale.og",
    "sitespeedio.crawler",
    "jbossas.jboss-dmr",
    "apache.creadur-rat",
    "jnr.jnr-posix",
    "albintheander.meqantt",
    "jsondiff",
    "asterisk-java",
    "code4craft.jsoup-learning",
    "pignlproc",
]

# mapeamentos de nomes para unificar variantes (evita duplicar joda-time, avro etc.)
NORMALIZE_MAP = {
    "apache avro": "apache.avro",
    "apache.avro": "apache.avro",
    "apache.gora": "apache.gora",
    "apache gora": "apache.gora",
    "jbossas.jboss-dmr": "jbossas.jboss-dmr",
    "jbossas jboss dmr": "jbossas.jboss-dmr",
    "joda time": "joda-time",
    "joda-time": "joda-time",
    "jnr posix": "jnr.jnr-posix",
    "jnr.jnr-posix": "jnr.jnr-posix",
    "cassandracompositetype": "cassandracompositetype",
    "edanuff.cassandracompositet": "cassandracompositetype",
    "oauth2.0providerforjava": "oauth2.0providerforjava",
    "bucchi.oauth2.0providerforjava": "oauth2.0providerforjava",
    "lucene-interval-fields": "lucene-interval-fields",
    "cue.lucene-interval-fields": "lucene-interval-fields",
    "codahale.og": "codahale.og",
    "com.greplin.zookeeper": "com.greplin.zookeeper",
    "recrack.kornakapi": "recrack.kornakapi",
    "connector4java": "connector4java",
    "sitespeedio.crawler": "sitespeedio.crawler",
    "albintheander.meqantt": "albintheander.meqantt",
    "jsondiff": "jsondiff",
    "asterisk-java": "asterisk-java",
    "code4craft.jsoup-learning": "code4craft.jsoup-learning",
    "pignlproc": "pignlproc",
    "gae-java-mini-profiler": "gae-java-mini-profiler",
}

def norm_key(s: str) -> str:
    return str(s).lower().replace(" ", "").replace("-", "").replace("_", "").replace(".", "")

def read_csv_flex(p: Path) -> pd.DataFrame:
    for enc in ("utf-8","utf-8-sig","latin-1"):
        for sep in (",",";","\t"):
            try:
                return pd.read_csv(p, encoding=enc, sep=sep)
            except Exception:
                continue
    return pd.read_csv(p)

def generate_formatted_if_missing():
    """Gera table2_tb_fa_by_project_formatted.csv a partir dos inspections se não existir."""
    if F_FMT.exists():
        return

    # --- leitura e detecção de colunas (Project Name, Conclusion) ---
    df_msl  = read_csv_flex(F_MSL)
    df_jmop = read_csv_flex(F_JMOP)

    # colunas esperadas
    proj_col = next((c for c in df_msl.columns if c.lower().strip() in {"project name","project","projects","name"}), None)
    concl_col= next((c for c in df_msl.columns if c.lower().strip() in {"conclusion","label","result","status"}), None)
    if proj_col is None or concl_col is None:
        raise RuntimeError("Não encontrei colunas de projeto/conclusão nos CSVs de MSL; ajuste os nomes no script.")

    def count_tb_fa(df: pd.DataFrame, approach: str) -> pd.DataFrame:
        # normaliza labels
        lab = df[concl_col].astype(str).str.lower()
        is_tb = lab.str.contains("true") & lab.str.contains("bug")
        is_fa = lab.str.contains("false") & lab.str.contains("alarm")
        out = (
            pd.DataFrame({
                "Projects": df[proj_col].astype(str),
                "TB": is_tb.astype(int),
                "FA": is_fa.astype(int),
            })
            .groupby("Projects", dropna=False)
            .sum(numeric_only=True)
            .reset_index()
        )
        out["approach"] = approach
        return out[["Projects","approach","TB","FA"]]

    agg = pd.concat([
        count_tb_fa(df_jmop, "JavaMOP"),
        count_tb_fa(df_msl,  "SIESTA"),
    ], ignore_index=True)

    piv = agg.pivot_table(index="Projects", columns="approach", values=["TB","FA"], aggfunc="sum", fill_value=0)
    piv.columns = [f"{approach}_{metric}" for metric, approach in piv.columns]
    for col in ["JavaMOP_TB","JavaMOP_FA","SIESTA_TB","SIESTA_FA"]:
        if col not in piv.columns: piv[col] = 0
    wide = piv[["JavaMOP_TB","JavaMOP_FA","SIESTA_TB","SIESTA_FA"]].reset_index()

    # unifica nomes equivalentes antes de seguir (evita duplicatas)
    wide["norm"] = wide["Projects"].map(norm_key)
    def unify(name_norm: str) -> str:
        # tenta mapear via NORMALIZE_MAP
        for k, v in NORMALIZE_MAP.items():
            if name_norm == norm_key(k):
                return v
        return wide.loc[wide["norm"] == name_norm, "Projects"].iloc[0]

    wide["Projects"] = wide["norm"].map(unify)

    # agrega novamente após unificação
    wide = wide.groupby("Projects", as_index=False).sum(numeric_only=True)

    # adiciona PID e Total (temporário; a ordenação final será aplicada depois)
    wide = wide.sort_values("Projects").reset_index(drop=True)
    wide.insert(0, "PID", range(1, len(wide)+1))
    final_tmp = wide[["PID","Projects","JavaMOP_TB","JavaMOP_FA","SIESTA_TB","SIESTA_FA"]]
    totals = {
        "PID": "Total",
        "Projects": "",
        "JavaMOP_TB": int(final_tmp["JavaMOP_TB"].sum()),
        "JavaMOP_FA": int(final_tmp["JavaMOP_FA"].sum()),
        "SIESTA_TB": int(final_tmp["SIESTA_TB"].sum()),
        "SIESTA_FA": int(final_tmp["SIESTA_FA"].sum()),
    }
    final_tmp = pd.concat([final_tmp, pd.DataFrame([totals])], ignore_index=True)
    final_tmp.to_csv(F_FMT, index=False)

def reorder_to_target():
    df = read_csv_flex(F_FMT)

    # remove linha Total para reordenar
    df_n = df[df["PID"].astype(str).str.lower() != "total"].copy()

    # normaliza nomes e agrega duplicados
    def map_to_canonical(name: str) -> str:
        n = NORMALIZE_MAP.get(norm_key(name), None)
        if n: return n
        # tenta "bater" por aproximação simples com as chaves do map
        for k, v in NORMALIZE_MAP.items():
            if norm_key(name) == norm_key(k):
                return v
        return name

    df_n["Projects"] = df_n["Projects"].map(map_to_canonical)
    df_n = df_n.groupby("Projects", as_index=False).sum(numeric_only=True)

    # reordena conforme TARGET_ORDER
    key_map = {norm_key(x): i for i, x in enumerate(TARGET_ORDER, start=1)}
    df_n["__key"] = df_n["Projects"].map(lambda s: key_map.get(norm_key(s), 10**9))
    df_n = df_n.sort_values(["__key"]).drop(columns="__key").reset_index(drop=True)

    # reatribui PID sequencial
    df_n.insert(0, "PID", range(1, len(df_n)+1))

    # recomputa Total
    total = {
        "PID": "Total",
        "Projects": "",
        "JavaMOP_TB": int(df_n["JavaMOP_TB"].sum()),
        "JavaMOP_FA": int(df_n["JavaMOP_FA"].sum()),
        "SIESTA_TB": int(df_n["SIESTA_TB"].sum()),
        "SIESTA_FA": int(df_n["SIESTA_FA"].sum()),
    }
    final = pd.concat([df_n, pd.DataFrame([total])], ignore_index=True)

    final.to_csv(F_OUT, index=False)
    print("[✓] Wrote:", F_OUT.as_posix())

if __name__ == "__main__":
    # 1) gera a tabela formatada se não existir
    generate_formatted_if_missing()
    # 2) reordena exatamente como solicitado
    reorder_to_target()
    print("Done.")
