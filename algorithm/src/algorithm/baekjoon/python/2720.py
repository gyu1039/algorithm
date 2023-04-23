T = int(input())

ls = []
Q = 25
D = 10
N = 5
P = 1

for i in range(T):
    tmp = []
    n = int(input())
    tmp.append(n // Q)
    n %= Q
    tmp.append(n // D)
    n %= D
    tmp.append(n // N)
    n %= N
    tmp.append(n // P)
    ls.append(" ".join(map(str, tmp)))

for n in ls:
    print(n)
