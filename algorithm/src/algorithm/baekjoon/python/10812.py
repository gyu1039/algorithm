
N, M = map(int, input().split())

ls = [i for i in range(1, N+1)]

for _ in range(M):
    i, j, k = map(int, input().split())
    i -= 1
    k -= 1
    tmp = ls[i:k]
    for n in tmp:
        ls.insert(j, n)
        j += 1
    for j in tmp:
        ls.remove(j)

for n in ls:
    print(n, end=" ")

