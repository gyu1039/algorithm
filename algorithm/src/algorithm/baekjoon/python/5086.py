import math

a, b = map(int, input().split())

result = []
while a != 0 and b != 0:

    if b % a == 0:
        result.append("factor")
    elif a % b == 0:
        result.append("multiple")
    else:
        result.append("neither")

    a, b = map(int, input().split())

print("\n".join(result))



