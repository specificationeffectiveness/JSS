# -*- coding: utf-8 -*-
# Gera: C:\Users\leona\Downloads\tratar_spec_csv\time_overhead_per_project_stats_en.csv
# Estatísticas por projeto x abordagem (ms):
#   - Shapiro-Wilk (p): 4 casas
#   - Média: 4 casas
#   - Mediana: 4 casas
#   - Desvio Padrão (amostral): 3 casas

import os
import pandas as pd
import numpy as np
from pathlib import Path
from scipy.stats import shapiro

# >>> USE RAW STRING NO WINDOWS (r"...") PARA NÃO QUEBRAR O CAMINHO <<<
SRC = Path(r"C:\UFPE\Siesta\rep\JSS\results\logs\Time_Overhead\time_overhead_raw_long.csv")
OUT_EN = Path(r"C:\UFPE\Siesta\rep\JSS\results\data\time_overhead_per_project_stats_en.csv")

def parse_float(s: str) -> float:
    if s is None or (isinstance(s, float) and np.isnan(s)):
        return np.nan
    s = str(s).strip().replace('"', '')
    # normaliza pontuação estranha, remove separador de milhares
    s = s.replace(",.", ".").replace(".,", ".").replace(",", "")
    try:
        return float(s)
    except Exception:
        return np.nan

def main():
    # 0) Checagens iniciais
    if not SRC.exists():
        raise FileNotFoundError(f"Arquivo de entrada não encontrado:\n{SRC}")

    print(f"[1/5] Lendo: {SRC}")
    raw = pd.read_csv(SRC, dtype=str, encoding="utf-8-sig")
    print(f"   Linhas: {len(raw)}  |  Colunas: {list(raw.columns)}")

    # 1) Tabela longa numérica (ms)
    records = []
    for _, row in raw.iterrows():
        proj = str(row["project"]).strip()
        for app_col, app_name in [("javamop_raw", "Javamop"),
                                  ("siesta_raw", "Siesta"),
                                  ("base_raw", "Base")]:
            val = parse_float(row.get(app_col))
            if not np.isnan(val):
                records.append({"Project": proj, "Approach": app_name, "value_ms": val})

    long_df = pd.DataFrame(records)
    if long_df.empty:
        raise RuntimeError("Nenhum valor numérico encontrado. Verifique o CSV de entrada.")

    print(f"[2/5] Amostras válidas: {len(long_df)} "
          f"(projetos={long_df['Project'].nunique()}, abordagens={long_df['Approach'].nunique()})")

    # 2) Estatísticas por projeto × abordagem
    rows = []
    for (proj, app), g in long_df.groupby(["Project", "Approach"]):
        vals = g["value_ms"].dropna().values
        if vals.size == 0:
            continue
        mean_v   = float(np.mean(vals))
        median_v = float(np.median(vals))
        std_v    = float(np.std(vals, ddof=1)) if vals.size > 1 else 0.0
        p_sw     = np.nan
        if vals.size >= 3:
            try:
                _, p_sw = shapiro(vals)
            except Exception:
                p_sw = np.nan

        rows.append({
            "Project": proj,
            "Shapiro-Wilk": p_sw,
            "Media": mean_v,
            "Mediana": median_v,
            "Desvio Padrão": std_v,
            "Approach": app
        })

    out_en = pd.DataFrame(rows).sort_values(["Project", "Approach"]).reset_index(drop=True)

    # 3) Arredondamentos
    out_en["Shapiro-Wilk"]  = out_en["Shapiro-Wilk"].round(4)
    out_en["Media"]         = out_en["Media"].round(4)
    out_en["Mediana"]       = out_en["Mediana"].round(4)
    out_en["Desvio Padrão"] = out_en["Desvio Padrão"].round(3)

    # 4) Salvar
    OUT_EN.parent.mkdir(parents=True, exist_ok=True)
    out_en.to_csv(OUT_EN, index=False, encoding="utf-8-sig")
    print(f"[3/5] Salvo: {OUT_EN}")

    # 5) Prévia no console (primeiras 10 linhas) + checagem Avro/Siesta
    print("\n[4/5] Prévia:")
    print(out_en.head(10).to_string(index=False))

    chk = out_en[(out_en["Project"].str.lower()=="avro") & (out_en["Approach"]=="Siesta")]
    if not chk.empty:
        print("\n[5/5] Checagem Avro/Siesta:")
        print(chk.to_string(index=False))

    # Confere existência
    print(f"\nArquivo existe? {os.path.exists(OUT_EN)}")

if __name__ == "__main__":
    main()
