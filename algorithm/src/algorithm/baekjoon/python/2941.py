

table = set(["c-", "c=", "dz=", "d-", "lj", "nj", "s=", "z="])
s = input()

count = 0
i = 0
while i < len(s):
    if s[i:i+2] in table:
        i += 2
        count += 1
        continue

    if s[i:i+3] in table:
        i += 3
        count += 1
        continue

    count += 1
    i += 1
print(count)
