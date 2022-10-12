bread, patty = map(int, input().split(' '))

maxCnt = bread//2

if patty > maxCnt:
    print(maxCnt)
elif patty <= maxCnt:
    print(patty)

