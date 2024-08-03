# 	120116	228
n = int(input())
targetNum = int(input())

lst = [[0 for _ in range(n)] for _ in range(n)]

centerRow = n // 2
centerCol = n // 2

row = centerRow
col = centerCol

# 해당 방향을 몇 번이나 갔는지
directionCount = 0
# 해당 방향을 언제 바꿀지
directionChangeCount = 1
# 방향을 2번씩 바꿀때마다 directionChangeCount += 1
directionChangeCountIdx = 0

# 방향의 종류
directionsIdx = 0

# 위, 오른쪽, 아래, 왼쪽
directionRow = [-1, 0, 1, 0]
directionCol = [0, 1, 0, -1]

# 초기값
lst[centerRow][centerCol] = 1

# 해당 좌표의 값
answerRow = centerRow
answerCol = centerCol
for i in range(2, (n ** 2) + 1):
    # directionChangeCount만큼 갔으면 방향을 바꿔주기
    if directionCount == directionChangeCount:
        directionsIdx = (directionsIdx + 1) % 4
        directionCount = 0
        directionChangeCountIdx += 1

        if (directionChangeCountIdx % 2) == 0:
            directionChangeCount += 1

    # 해당 방향으로 가기
    row += directionRow[directionsIdx]
    col += directionCol[directionsIdx]
    directionCount += 1

    # 해당 수 바꿔주기
    lst[row][col] = i
    if i == targetNum:
        answerRow = row
        answerCol = col

for i in lst:
    print(*i)
print(answerRow+1,answerCol+1)
