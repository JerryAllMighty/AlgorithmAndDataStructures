# 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

def solution(N, stages):
    answer = []
    stages.sort()
    failRateMap = {}
    for i in range(1, N+1):
        for j in range(len(stages)):
            stage = stages[j]
            cnt = stages.count(stage)
            bunmo = cnt
            for k in stages:
                if k > stage:
                    bunmo += 1

            failRate = cnt/bunmo
            failRateMap[stage] = failRate



    return answer

print(solution(5,[2, 1, 2, 6, 2, 4, 3, 3]))