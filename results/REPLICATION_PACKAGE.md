# JSS – Replication Package

Replication package of the paper titled *"Assessing the Effectiveness of a Minimalist Specification Language for Java Runtime Behavior Verification"* submitted to the **Journal of Systems and Software (JSS)**.

This study has been designed, developed, and reported by the following investigators:

* Leonardo de Souza Lima (UFPE)
* Breno Miranda (UFPE)
* Leopoldo Teixeira (UFPE)
* Marcelo d'Amorim (NC State University)

For any information, interested researchers can contact us by opening an issue in the repository or by sending an email to any of the investigators listed above. The full dataset including raw data, analysis scripts, and generated figures produced during the study are available below.

---

## How to cite this work

If this work or the dataset is helping your research, please consider citing it as follows:

```bibtex
@article{Lima2025_MSL_JSS_Preprint,
  title   = {Assessing the Effectiveness of a Minimalist Specification Language for Java Runtime Behavior Verification},
  author  = {Leonardo de Souza Lima and Breno Miranda and Leopoldo Teixeira and Marcelo d'Amorim},
  journal = {Journal of Systems and Software},
  year    = {2025},
  note    = {Preprint. Under review.},
  url     = {https://github.com/specificationeffectiveness/JSS},
}
```

---

## Overview of the replication package

This replication package is structured as follows:

```
/
.
|--- data/                The final datasets used in the study (per-project results, runtime samples).
|--- scripts/             Python scripts for computing totals, differences, and plots.
|--- figures/             Output figures generated from the scripts.
|--- intermediate/        Optional intermediate artifacts not directly used in the paper.
```

Each of the folders listed above is described in detail in the remainder of this README.

---

## Data

**data/**

```
|--- inspections-javamop.csv        Per-project inspection results for JavaMOP.
|--- inspections-msl.csv            Per-project inspection results for SIESTA/MSL.
|--- runtime_samples_median_based.csv  Example dataset for generating runtime boxplots.
```

These CSV files contain the core quantitative evidence used in RQ1 and RQ2. Columns `TB`, `HTI`, and `FA` denote **True Bug**, **Hard-to-Inspect**, and **False Alarm** respectively.

---

## Scripts

**scripts/**

```
|--- compute_violations_diff.py     Computes total violations per approach and differences per project.
|--- aggregate_table2.py            Generates Table 2 spreadsheets with counts of True Bugs and False Alarms per project.
|--- mensure_date_table3.py         Produces Table 3 with evaluation metrics: F1-score, Precision, and Recall.
|--- make_boxplot.py                Creates the runtime boxplot based on median-based samples.
|--- requirements.txt               List of Python dependencies required to run the scripts.
```

The scripts are written in Python (≥3.9). To reproduce the results:

```bash
cd results
python -m venv .venv && source .venv/bin/activate
pip install -r scripts/requirements.txt

# Compute totals and differences
python scripts/compute_violations_diff.py \
  --msl data/inspections-msl.csv \
  --javamop data/inspections-javamop.csv

# Generate boxplot
python scripts/make_boxplot.py \
  --input data/runtime_samples_median_based.csv \
  --out figures/boxplot_runtime.png
```

---

## Figures

**figures/**

```
|--- fig1_osmac_javamop.png          Example JavaMOP specification (RQ1 context).
|--- fig2_osmac_siesta.png           Example SIESTA specification (RQ1 context).
|--- fig3_flushbeforeretrieve.png    Example monitored property FlushBeforeRetrieve.
|--- fig4_methodology_overview.png   Overview of the methodology and workflow.
|--- rq1_distinct_violations.png     Results for RQ1 (distinct violations).
|--- rq2_false_alarm_example.png     Example of false alarm (RQ2).
|--- rq2_false_alarm_spec.png        Specification excerpt related to false alarm (RQ2).
|--- rq5_overhead_boxplot.png        Runtime overhead comparison (RQ5).

```

All figures used in the paper can be reproduced using the provided datasets and scripts.

---

## License

This replication package is distributed under the **.
