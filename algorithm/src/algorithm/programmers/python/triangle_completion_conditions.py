def solution(sides):

    sides.sort()
    answer = 2
    if sides[0] + sides[1] > sides[2]:
        answer = 1
    return answer

