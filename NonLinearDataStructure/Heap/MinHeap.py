import heapq
from sys import stdin
numOfArray = int(stdin.readline())
cnt = 0
arrayToSolve = []
while cnt < numOfArray:
    try:
        givenNum = int(stdin.readline())

        # 0을 입력받으면 출력해야함
        if givenNum == 0:
            if len(arrayToSolve) == 0:
                print(0)
            else:
                print(heapq.heappop(arrayToSolve))
        else:
            heapq.heappush(arrayToSolve, givenNum)
        cnt += 1
    except EOFError:
        break

