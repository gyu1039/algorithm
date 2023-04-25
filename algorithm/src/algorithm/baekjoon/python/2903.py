
N = int(input())

ls = [0 for _ in range(N+1)]
ls[0] = 2
for i in range(1, N+1):
    ls[i] = ls[i-1]*2 - 1

print(ls[N] ** 2)
