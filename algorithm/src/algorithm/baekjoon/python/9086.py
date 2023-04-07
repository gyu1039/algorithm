
T = int(input())
result = []
for _ in range(T):
    s = input()
    ls = list()
    ls.append(s[0])
    ls.append(s[-1])
    result.append(''.join(ls))

for s in result:
    print(s)
