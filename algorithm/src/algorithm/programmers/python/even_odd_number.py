def solution(num_list):
    answer = [0 for i in range(2)]

    for n in num_list:
        answer[n % 2] += 1

    return answer
