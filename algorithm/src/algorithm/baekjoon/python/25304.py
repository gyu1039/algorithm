amount_written_on_the_receipt = int(input())
N = int(input())
s = 0
for i in range(4):
    tmp = list(map(int, input().split()))
    s += tmp[0] * tmp[1]

print("Yes" if s == amount_written_on_the_receipt else "No")
