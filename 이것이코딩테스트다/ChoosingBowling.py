def solution(cnt, max, lst):

    answer = 0
    for i in range(len(lst)):
        for j in range(i, len(lst)):
            if lst[i] == lst[j]:
                continue
            else:
                answer += 1

    return answer

print(solution(5,3,[1,3,2,3,2]))