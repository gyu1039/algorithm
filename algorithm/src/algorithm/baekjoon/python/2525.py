
a = list(map(int, input().split()))
b = int(input())

c = divmod(b + a[1], 60)
d = divmod(a[0] + c[0], 24)


print(d[1], c[1])
