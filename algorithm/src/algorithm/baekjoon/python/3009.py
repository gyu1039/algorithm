from collections import Counter

xs = Counter()
ys = Counter()

for _ in range(3):
    x, y = map(int, input().split())
    xs.update([x])
    ys.update([y])

result = []
for e in xs:
    if xs.get(e) == 1:
        result.append(e)

for e in ys:
    if ys.get(e) == 1:
        result.append(e)

print(" ".join(map(str, result)))



