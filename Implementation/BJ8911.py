#시간 초과였던 문제 풀이
# import collections
#
# n = int(input())
#
# x = [-1, 0, 1, 0]
# y = [0, 1, 0, -1]
# offset = 500
# answers = []
# for i in range(n):
#     lst = [
#         [0 for i in range(500)]
#         for _ in range(500)
#         # 디버깅용
#         # [0 for i in range(10 * n)]
#         # for _ in range(10 * n)
#     ]
#     directionIdx = 1
#     minRow = 0
#     maxRow = 0
#     minCol = 0
#     maxCol = 0
#     currentRow = 0
#     currentCol = 0
#     val = input()
#
#     for j in val:
#         if j == 'R':
#             directionIdx = ((directionIdx + 1) % 4)
#         elif j == 'L':
#             directionIdx = ((directionIdx - 1) % 4)
#         elif j == 'F':
#             lst[currentRow + x[directionIdx]][currentCol + y[directionIdx]] = 1
#             currentRow += x[directionIdx]
#             currentCol += y[directionIdx]
#
#         elif j == 'B':
#             lst[currentRow + x[(directionIdx -2) % 4]][currentCol + y[(directionIdx -2) % 4]] = 1
#             currentRow += x[(directionIdx -2) % 4]
#             currentCol += y[(directionIdx -2) % 4]
#
#         if currentRow < minRow:
#             minRow = currentRow
#         elif currentRow > maxRow:
#             maxRow = currentRow
#
#         if currentCol < minCol:
#             minCol = currentCol
#         elif currentCol > maxCol:
#             maxCol = currentCol
#
#     answers.append((maxRow - minRow) * (maxCol - minCol))
#
# for i in answers:
#     print(i)


# 시간 초과 해결
# 500개로 제한된 움직임의 크기로 인하여 리스트의 크기도 똑같이 제한하였지만 결국 시간 초과의 원인이 됨.
# 리스트의 크기를 초반에 한정 지어주지 않고, offset을 활용하지 않는 대신, 움직인 거리의 절댓값을 활용하는 방법으로 변경
# 31120 3468 python3
cnt = int(input())
answers = []

for _ in range(cnt):
    val = input()
    x = [0, 1, 0, -1]
    y = [1, 0, -1, 0]
    directionIdx = 0
    minX = 0
    maxX = 0
    minY = 0
    maxY = 0
    currentDirection = [0, 0]
    for i in val:
        if i == 'F':
            currentDirection[0] += x[directionIdx % 4]
            currentDirection[1] += y[directionIdx % 4]
        elif i == 'B':
            currentDirection[0] -= x[directionIdx % 4]
            currentDirection[1] -= y[directionIdx % 4]
        elif i == 'L':
            directionIdx -= 1
        elif i == 'R':
            directionIdx += 1

        minX = min(minX, currentDirection[0])
        maxX = max(maxX, currentDirection[0])
        minY = min(minY, currentDirection[1])
        maxY = max(maxY, currentDirection[1])

    answers.append((maxX - minX) * (maxY - minY))

for i in answers:
    print(i)
