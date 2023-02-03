def solution(n, k):
    k -= n // 10
    k = 0 if k < 0 else k

    return n * 12_000 + k * 2_000


print(solution(10, 3))
