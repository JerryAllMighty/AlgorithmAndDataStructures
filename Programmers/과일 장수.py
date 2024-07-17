def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    limitIdx = (len(score)//m) * m
    cnt = 0
    tempList = []
    for i in score[:limitIdx]:
        cnt += 1
        tempList.append(i)
        if cnt == m:
            cnt = 0
            answer += min(tempList) * m
            tempList = []

    return answer

print(solution(3,	4,	[1, 2, 3, 1, 2, 3, 1]))