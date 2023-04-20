
n = int(input())

paper = [[0 for i in range(100)] for i in range(100)]

for _ in range(n):
    x, y = map(int, input().split())
    x -= 1
    y -= 1
    for i in range(10):
        for j in range(10):
            paper[x+i][y+j] = 1

area = 0
for i in range(100):
    for j in range(100):
        if paper[i][j] == 1:
            area += 1

print(area)