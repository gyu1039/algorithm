N, M = map(int, input().split())

ls = [[0 for _ in range(M)] for _ in range(N)]
for i in range(N):
    tmp = list(map(int, input().split()))
    for j in range(M):
        ls[i][j] = tmp[j]

for i in range(N):
    tmp = list(map(int, input().split()))
    for j in range(M):
        ls[i][j] += tmp[j]

for els in ls:
    for e in els:
        print(e, end= " ")
    print()