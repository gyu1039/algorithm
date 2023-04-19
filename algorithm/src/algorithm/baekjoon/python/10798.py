

str1 = list(input())
str2 = list(input())
str3 = list(input())
str4 = list(input())
str5 = list(input())


result = []
while len(str1) > 0 or len(str2) > 0 or len(str3) > 0 or len(str4) > 0 or len(str5) > 0 :

    if len(str1) > 0:
        result.append(str1.pop(0))

    if len(str2) > 0:
        result.append(str2.pop(0))

    if len(str3) > 0:
        result.append(str3.pop(0))

    if len(str4) > 0:
        result.append(str4.pop(0))

    if len(str5) > 0:
        result.append(str5.pop(0))

print("".join(result))
