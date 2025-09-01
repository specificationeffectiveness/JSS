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
├── data/           → Final CSV datasets used in the study
├── scripts/        → Python scripts for analysis and plotting
├── figures/        → Plots and images generated from the study
├── agent/          → Java agent used for runtime instrumentation
├── logs/           → Output logs and regression test files for each project
```

Each of the folders listed above is described in detail in the remainder of this README.

---

## Data

**data/**

| File Name | Description |
|-----------|-------------|
| `distinct_violations_RQ1.csv` | Violation count comparison between Siesta and JavaMOP (used in RQ1) |
| `table2_tb_fa_by_project_RQ2.csv` | True Bugs and False Alarms per project (used in RQ2) |
| `data_false_negative.csv` | False negatives found per property or project |
| `data_false_positive.csv` | False positives generated during validation |
| `Table3_Results_FP_FN_with_Recall_and_F1_Score_RQ3.csv` | Recall, Precision, and F1 Score results for RQ3 |
| `time_overhead_by_project_rq5.csv` | Runtime overhead values grouped by project (RQ5) |
| `violation_javamop.csv` | Raw violations detected by JavaMOP |
| `violation_siesta.csv` | Raw violations detected by Siesta |
| `projects.csv` | Metadata for each analyzed project |
| `specifications_siesta.csv` | Siesta specifications and implementation status |
| `Specifications.csv` | Raw version of specifications list |
| `specifications_organizadas.csv` | classified list of specifications |
"""

These CSV files contain the core quantitative evidence used in RQ1 and RQ2. Columns `TB`, `HTI`, and `FA` denote **True Bug**, **Hard-to-Inspect**, and **False Alarm** respectively.

---

## Scripts

**scripts/**

| Script Name | Purpose |
|-------------|---------|
| `violations_diff_RQ1.py` | Computes the number of total and varying violations between Siesta and JavaMOP (RQ1), and generates a bar plot summarizing this difference. |
| `aggregate_table2_RQ2.py` | Aggregates True Bugs (TB) and False Alarms (FA) per project to produce the data for Table 2 (RQ2). |
| `aggregate_table3_RQ3.py` | Computes Recall, Precision, and F1 Score for Table 3 based on False Positives and False Negatives (RQ3). |
| `time_overhead_by_project_rq5.py` | Calculates runtime statistics per project (mean, median, std. deviation, normality) for RQ5. |
| `generate_grafic_boxplot_time_over_rq5.py` | Produces a boxplot (log-scale) comparing execution times for Base, JavaMOP, and Siesta across projects (RQ5). |
"""

The scripts are written in Python (≥3.9). To reproduce the results:


## Figures

**figures/**

```
- **fig1_osmac_javamop.png.PNG**: Figure 1: Specification Example: The OSMAC JavaMOP property and a related bug
- **fig2_osmac_siesta.PNG**: Figure 2: Example: OutputStream_ManipulateAfterClose using SIESTA
- **fig3_flushbeforeretrieve.PNG**: Figure 3: ByteArrayOutputStream_FlushBeforeRetrieve property written in SIESTA
- **fig4_methodology_overview.png**: Figure 4: Methodology overview used in our experimental evaluation
- **rq1_violations_summary_grafic.png**: Figure 5: Violation Distribution - Total vs Varying Behavior
- **rq2_false_alarm_example.png.PNG**: Figure 6: Example Project JBoss-dmr for False Alarms from the Closeable_MultipleClose Specification
- **rq2_false_alarm_spec.png.PNG**: Figure 7: False alarms from Closeable_MultipleClose Specification
- **rq5_overhead_boxplot.png**: Figure 8: Execution time overhead comparison using log scale

```


All figures used in the paper can be reproduced using the provided datasets and scripts.

## logs
** logs/

This folder includes execution logs for each benchmarked project. For each project:

---
logs/<project_name>/
├── javamop.log          ← JavaMOP results
├── siestag              ← Siesta results
├── RegressionTest*.java ← Generated tests
├── *.properties         ← Config files


## License

This replication package is distributed under the **.
