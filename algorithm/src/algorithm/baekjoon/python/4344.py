
C = int(input())

for _ in range(C):
    ls = list(map(int, input().split()))
    n = ls[0]
    s = sum(ls) - n
    count = 0
    for i in range(1, len(ls)):
        if s/n < ls[i]:
            count += 1

    print("{0:.3f}%".format(count / n * 100))
