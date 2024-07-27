n = int(input())

# 별의 개수는 2m+1
# 전체 칸의 개수는 2 * (n-1) + 1
totalCnt = 2 * n
emptyList = [' ' for i in range(totalCnt)]
answers = []

for i in range((totalCnt // 2) + 1):
    # 별 찍기
    # 별 상단부
    # 별의 시작점과 갯수만큼 시행
    startIdx = (totalCnt // 2) - i
    starCnt = (2 * i) + 1
    while (starCnt > 0):
        emptyList[startIdx] = '*'
        startIdx += 1
        starCnt -= 1

    print(''.join(emptyList))

for i in range((totalCnt // 2) + 1, totalCnt):
    # 별 하단부
    cnt = i - (totalCnt // 2)
    leftIdx = 0
    rightIdx = totalCnt - 1
    while (cnt > 0):
        emptyList[leftIdx] = ' '
        emptyList[rightIdx] = ' '
        cnt -= 1
        leftIdx += 1
        rightIdx -= 1
    print(''.join(emptyList))
