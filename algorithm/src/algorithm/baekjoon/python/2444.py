
n = int(input())

for i in range(n-1):
    print(" " * (n-(i+1)), sep='', end='')
    print("*" * (2*i + 1))

for i in range(n):
    print(" " * i, sep='', end='')
    print("*" * (2*(n-i)-1))
