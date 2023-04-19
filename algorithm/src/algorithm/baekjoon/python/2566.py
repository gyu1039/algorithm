
ls = [[0 for _ in range(9)] for _ in range(9)]

for i in range(9):
    ls[i] = list(map(int, input().split()))

max_value = -1
row = -1
col = 1
for i in range(9):
    for j in range(9):
        if max_value < ls[i][j]:
            row = i
            col = j
            max_value = ls[i][j]

print(max_value)
print(row+1, col+1)
