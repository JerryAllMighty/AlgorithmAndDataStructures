import collections
import heapq

def solution(jobs):
    everyAvg = []

    def finishTime(startTime, duration):
        return startTime + duration

    def getAverageTime(dic):
        totTime = 0
        #먼저 요청이 들어온 것부터 실행
        startTime = list(dic.keys())[0]
        for key, value in dic.items():
            startTime = finishTime(startTime, value)
            totTime
            totTime += startTime - key
        heapq.heappush(everyAvg, totTime // len(dic))
        return totTime
    # 소요 시간이 적게 걸리는 것부터
    #돌 수 있는 순서를 모두 구하기
    idxList = []
    
    for idx in range(len(jobs)):
        idxList.append(idx)
    totIdxList = []
    for i in range(len(idxList)-1):
        aa = idxList.copy()
        for p in range(i, len(idxList)-1):
            aa[i], aa[i+1] = aa[i+1], aa[i]
            totIdxList.append(str(aa))

    # 각기 다른 딕셔너리를 실행시키며 평균 값을 구하기
    for u in totIdxList:
        dic = collections.defaultdict()
        eachList = list(u)
        for idx in eachList:
            if idx.isnumeric():
                eachTask = jobs[int(idx)]
                dic[eachTask[0]] = eachTask[1]
        #for문 하나 돌면 딕셔너리 하나
        getAverageTime(dic)

    return heapq.heappop(everyAvg)


print(solution([[0, 3], [1, 9], [2, 6]]))