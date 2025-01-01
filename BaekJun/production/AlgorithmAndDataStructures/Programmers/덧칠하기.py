def solution(n, m, section):
    answer = 0
    current = 0
    for i in section:
        if i > current:
            current = i + m - 1
            answer += 1

    return answer



print(solution(8,	4,	[2, 3, 6]))