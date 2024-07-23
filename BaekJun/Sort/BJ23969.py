import sys
n,m = map(int,sys.stdin.readline().split(' '))
givenList = list(map(int,sys.stdin.readline().split(' ')))
cnt = 0
answer = -1
for i in range(n):
    for j in range(n-1):
        if givenList[j] > givenList[j+1]:
            givenList[j],givenList[j+1] = givenList[j+1],givenList[j]
            cnt += 1

        if cnt == m:
            print(*givenList)
            exit(0)

print(answer)
