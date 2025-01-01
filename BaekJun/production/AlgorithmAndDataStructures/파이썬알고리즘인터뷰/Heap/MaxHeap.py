import heapq
from sys import stdin
numOfArray = int(stdin.readline())
arrayToSolve = []
for _ in range(numOfArray):
    givenNum = int(stdin.readline())
    # 0을 입력받으면 출력해야함
    if givenNum == 0:
        if len(arrayToSolve) == 0:
            print(0)
        else:
            print(-1 * heapq.heappop(arrayToSolve))
    else:
        heapq.heappush(arrayToSolve, -givenNum)

