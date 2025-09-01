import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from pathlib import Path

STATS = Path(r"C:\UFPE\Siesta\rep\JSS\results\data\time_overhead_by_project_rq5.csv")
OUT = Path(r"C:\UFPE\Siesta\rep\JSS\results\figures\rq5_overhead_boxplot.png")

df = pd.read_csv(STATS)

jm_ms = df[df["Approach"]=="Javamop"]["Mediana"].astype(float).values
si_ms = df[df["Approach"]=="Siesta"]["Mediana"].astype(float).values
ba_ms = df[df["Approach"]=="Base"]["Mediana"].astype(float).values

SCALE = 1000.0
jm_plot = jm_ms * SCALE
si_plot = si_ms * SCALE
ba_plot = ba_ms * SCALE

fig, ax = plt.subplots(figsize=(12, 8))

bp = ax.boxplot(
    [jm_plot, si_plot, ba_plot],
    labels=["JavaMOP", "MSL", "Base"],
    showfliers=False,
    patch_artist=True,
    medianprops=dict(color="black", linewidth=2),
    boxprops=dict(color="black", linewidth=1.5),
    whiskerprops=dict(color="black", linewidth=1.2),
    capprops=dict(color="black", linewidth=1.2),
)

# Fill colors
fills = ['DarkTurquoise', 'Gold', 'OrangeRed']
for patch, color in zip(bp['boxes'], fills):
    patch.set_facecolor(color)
    patch.set_alpha(0.9)

ax.set_yscale("log", base=10)
ax.set_ylabel("Time (log scale)")

# Major ticks at the article scale (ms), show grid only there
ticks_ms = [1000, 2000, 5000, 10000, 25000, 50000, 100000, 200000]
ax.set_yticks(ticks_ms)
ax.set_yticklabels(['1s', '2s', '5s', '10s', '25s', '50s', '100s', '200s'])
ax.set_ylim(1000, 200000)

# Grid only on major ticks (horizontal)
ax.grid(True, which='major', axis='y', linestyle='-', color='0.85')
ax.grid(False, which='minor', axis='y')

fig.tight_layout()
fig.savefig(OUT, dpi=200)
plt.show()

OUT.as_posix()
