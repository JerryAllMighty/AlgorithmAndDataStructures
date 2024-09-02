n = int(input())
cnt = 0
startNum = 1
while (startNum != n):
    if (startNum + 1 == n) or startNum == 1:
        n += 1
    elif (startNum * 3) <= n and startNum % 3 == 0:
        n *= 3
    elif startNum % 2 == 0:
        n *= 2


    cnt += 1

print(cnt)
