import sys
n = int(sys.stdin.readline().rstrip())
aList = list(map(int,sys.stdin.readline().split(' ')))
bList = list(map(int,sys.stdin.readline().split(' ')))

answer = -1
cnt = 0

if aList == bList:
    print(1)
    exit(0)

for i in range(n):
    for j in range(n-1-i):
        if aList[j] > aList[j+1]:
            aList[j], aList[j+1] = aList[j+1], aList[j]

        if aList[j] == bList[j] and aList == bList:
            print(1)
            exit(0)
print(0)
