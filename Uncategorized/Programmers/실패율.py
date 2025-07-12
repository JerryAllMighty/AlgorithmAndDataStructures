# 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

def solution(N, stages):
    answer = []
    stages.sort()
    failRateMap = {}
    for i in range(len(stages)):
        # 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
        currentStage = stages[i]
        if currentStage == N+1:
            currentStage -=1
        notClear =  0
        reached = 0
        # 스테이지에 도달한 플레이어 수
        for j in stages:
            if j > currentStage:
                reached += 1
            if j == currentStage:
                notClear += 1
                reached += 1
        
        # 실패율 저장
        failRateMap[currentStage] = notClear/reached

    failRateSortedMap = sorted(failRateMap.items(), key=lambda item: item[1], reverse=True)

    for key, value in failRateSortedMap:
        answer.append(key)

    return answer

print(solution(4, 	[4,4,4,4,4]))