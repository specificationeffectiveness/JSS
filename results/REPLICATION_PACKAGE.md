
# IST – Replication Package

Replication package of the paper titled *"Assessing the Effectiveness of a Minimalist Specification Language for Java Runtime Behavior Verification"* submitted to the **Information and Software Technology (IST)**.

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
@article{Lima2025_SIESTA_IST_Preprint,
  title   = {Assessing the Effectiveness of a Minimalist Specification Language for Java Runtime Behavior Verification},
  author  = {Leonardo de Souza Lima and Breno Miranda and Leopoldo Teixeira and Marcelo d'Amorim},
  journal = {Journal of Systems and Software},
  year    = {2025},
  note    = {Preprint. Under review.},
  url     = {https://github.com/specificationeffectiveness/IST},
}
```

---

## Overview of the replication package

This replication package is structured as follows:

```
/
├── data/           → Final CSV datasets used in the study
├── scripts/        → Python scripts for analysis and plotting
├── figures/        → Plots and images generated from the study
├── agent/          → Java agent used for runtime instrumentation
├── logs/           → Output logs and regression test files for each project
```

Each of the folders listed above is described in detail in the remainder of this README.

---

## 📁 Data (`data/`)

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
| `specifications_organizadas.csv` | Classified list of specifications |

These CSV files contain the core quantitative evidence used in RQ1 and RQ2. Columns `TB`, `HTI`, and `FA` denote **True Bug**, **Hard-to-Inspect**, and **False Alarm**, respectively.

---

## 📜 Scripts (`scripts/`)

| Script Name | Purpose |
|-------------|---------|
| `violations_diff_RQ1.py` | Computes total and differing violations between Siesta and JavaMOP (RQ1); generates a bar plot. |
| `aggregate_table2_RQ2.py` | Aggregates True Bugs and False Alarms per project (RQ2). |
| `aggregate_table3_RQ3.py` | Computes Recall, Precision, and F1 Score for RQ3. |
| `time_overhead_by_project_rq5.py` | Analyzes runtime performance per project (RQ5). |
| `generate_grafic_boxplot_time_over_rq5.py` | Produces a log-scale boxplot comparing execution times (RQ5). |

All scripts are written in **Python 3.9+** and use libraries like `pandas` and `matplotlib`.

---

## 📊 Figures (`figures/`)

| File | Description |
|------|-------------|
| `fig1_osmac_javamop.png.PNG` | Figure 1: Specification Example in JavaMOP |
| `fig2_osmac_siesta.PNG` | Figure 2: Specification Example in Siesta |
| `fig3_flushbeforeretrieve.PNG` | Figure 3: ByteArrayOutputStream_FlushBeforeRetrieve property written in Siesta |
| `fig4_methodology_overview.png` | Figure 4: Overview of the methodology used |
| `rq1_violations_summary_grafic.png` | Figure 5: Total vs Differing Violations |
| `rq2_false_alarm_example.png.PNG` | Figure 6: False Alarms from Closeable_MultipleClose (project: JBoss-dmr) |
| `rq2_false_alarm_spec.png.PNG` | Figure 7: Specification causing multiple false alarms |
| `rq5_overhead_boxplot.png` | Figure 8: Execution time overhead comparison (log-scale) |

All figures were generated using the data and scripts provided.

---

## 📂 Logs (`logs/`)

This directory contains all runtime monitoring logs and instrumentation output.

Each subfolder inside `logs/` refers to a monitored project and includes:

```
logs/<project_name>/
├── javamop.log            # Output from JavaMOP monitoring
├── siesta.log             # Output from Siesta monitoring
├── RegressionTest*.java   # Generated test classes
├── *.properties           # Monitoring configuration files
```

You may also find:
- `logs/Time_Overhead/`: execution time logs for overhead analysis
- Split `.log` files (e.g., `siesta_part_aa`, `siesta_part_ab`, ...) used to bypass GitHub's size limit

---

## 📄 License

This replication package is distributed under the ****.
