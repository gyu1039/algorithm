a, b, c, d, e, f = map(int, input().split())

result = ""
for x in range(-999, 1000):
    for y in range(-999, 1000):
        if a*x + b*y == c and d*x + e*y == f:
            result = "{} {}".format(x, y)

print(result)