def makeRank(num):
    rank = 0
    if num == 6:
        return 1
    if num == 5:
        return 2
    if num == 4:
        return 3
    if num == 3:
        return 4
    if num == 2:
        return 5
    else:
        return 6


def solution(lottos, win_nums):
    answer = []
    matchCnt = 0
    unknown = 0
    for i in lottos:
        if i == 0:
            unknown += 1
        if i in win_nums:
            matchCnt += 1

    # 등수를 답에 넣어주기
    bestPossible = makeRank(matchCnt + unknown)
    worstPossible = makeRank(matchCnt)

    answer.append(bestPossible)
    answer.append(worstPossible)

    return answer


print(solution([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35]))