

n = int(input())

ls = [0 for i in range(n+1)]
ls[0] = 0
ls[1] = 1
for i in range(2, n+1):
    ls[i] = ls[i-1] + ls[i-2]

print(ls[n], end=' ')
print(n - 2)
