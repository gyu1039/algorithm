import math

a = int(input())

result = []

while a != -1:
    tmp = []

    for i in range(1, a // 2 + 1):
        if a % i == 0:
            tmp.append(i)

    if sum(tmp) == a:
        result.append("{} = {}".format(a, " + ".join(map(str, tmp))))
    else:
        result.append("{} is NOT perfect.".format(a))

    a = int(input())

print("\n".join(result))