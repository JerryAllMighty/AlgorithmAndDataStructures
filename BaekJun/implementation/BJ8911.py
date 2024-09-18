import collections

n = int(input())

x = [-1, 0, 1, 0]
y = [0, 1, 0, -1]
offset = 500
answers = []
for i in range(n):
    lst = [
        [0 for i in range(500)]
        for _ in range(500)
        # 디버깅용
        # [0 for i in range(10 * n)]
        # for _ in range(10 * n)
    ]
    directionIdx = 1
    minRow = 0
    maxRow = 0
    minCol = 0
    maxCol = 0
    currentRow = 0
    currentCol = 0
    val = input()

    for j in val:
        if j == 'R':
            directionIdx = ((directionIdx + 1) % 4)
        elif j == 'L':
            directionIdx = ((directionIdx - 1) % 4)
        elif j == 'F':
            lst[currentRow + x[directionIdx]][currentCol + y[directionIdx]] = 1
            currentRow += x[directionIdx]
            currentCol += y[directionIdx]

        elif j == 'B':
            lst[currentRow + x[(directionIdx -2) % 4]][currentCol + y[(directionIdx -2) % 4]] = 1
            currentRow += x[(directionIdx -2) % 4]
            currentCol += y[(directionIdx -2) % 4]

        if currentRow < minRow:
            minRow = currentRow
        elif currentRow > maxRow:
            maxRow = currentRow

        if currentCol < minCol:
            minCol = currentCol
        elif currentCol > maxCol:
            maxCol = currentCol

    answers.append((maxRow - minRow) * (maxCol - minCol))

for i in answers:
    print(i)
