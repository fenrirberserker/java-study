import sys
import io
import pypdf

sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding="utf-8", errors="replace")

path = sys.argv[1]
start = int(sys.argv[2])
end = int(sys.argv[3])

r = pypdf.PdfReader(path)
n = len(r.pages)
end = min(end, n)
for i in range(start - 1, end):
    print(f"--- PAGE {i + 1} / {n} ---")
    try:
        print(r.pages[i].extract_text())
    except Exception as e:
        print(f"[extract error: {e}]")
