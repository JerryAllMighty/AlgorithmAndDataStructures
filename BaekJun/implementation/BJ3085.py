cnt = map(int, input())
targets = []

for _ in range(cnt):
    row = list(input())
    targets.append(row)

for row in range(cnt):
    for col in range(cnt):
        # we choose 2 with different colors

        # row and row
        if col != cnt - 1 and targets[row][col] != targets[row][col+1]:
            targets[row][col], targets[row][col+1] = targets[row][col+1], targets[row][col]
        # row and column
        if row != cnt-1 and targets[row][col] != targets[row+1][col]:
            targets[row][col], targets[row + 1][col] = targets[row+1][col], targets[row][col]

# find the longest consecutive
answer = 0

longestRowList = []
longestColList = []

for row in range(cnt):
    longestRow = 0
    for col in range(cnt):
        longestCol = 0

        # find the longest row
        if col != cnt-1 and targets[row][col] == targets[row][col+1]:
            longestRow += 1
        else:
            longestRowList.append(longestRow)
            longestRow = 0

        # find the longest col
        if row != cnt - 1 and targets[row][col] == targets[row+1][col]:
            longestCol += 1
        else:
            longestColList.append(longestCol)
            longestCol = 0



print(max(longestRowList), max(longestColList))



