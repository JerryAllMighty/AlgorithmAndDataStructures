import sys
n,m = map(int, sys.stdin.readline().strip().split(' '))
givenList = list(map(int, sys.stdin.readline().strip().split(' ')))
cnt = 0
answer = -1
for i in range(n):
    for j in range(n-1):
        if givenList[j] > givenList[j+1]:
            givenList[j], givenList[j + 1] = givenList[j+1], givenList[j]
            cnt += 1

        if cnt == m:
            print(str(givenList[j]) + ' ' + str(givenList[j + 1]))
            exit(0)


print(answer)






