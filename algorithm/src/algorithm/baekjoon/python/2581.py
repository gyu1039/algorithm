import math

M = int(input())
M = 2 if M == 1 else M
N = int(input())
N = 2 if M == 1 else N

summ = []

for i in range(M, N+1):

    for j in range(2, math.isqrt(i)+1):
        if i % j == 0:
            break
    else:
        summ.append(i)

if len(summ) == 0:
    print(-1)
else:
    print("{}\n{}".format(sum(summ), summ[0]))
