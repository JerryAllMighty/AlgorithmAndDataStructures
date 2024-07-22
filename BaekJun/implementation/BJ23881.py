length, cnt = map(int, input().split(' '))
givenList = list(map(int, input().split(' ')))

visited = []
originalIdx = 0
answer = '-1'
changedCnt = 0
for j in range(1, length+1):
    maxNum = 1
    for i in range(length):
        if givenList[i] > maxNum and givenList[i] not in visited:
            maxNum = givenList[i]
            originalIdx = i


    if givenList[originalIdx-1] != maxNum:
        givenList[maxNum-1], givenList[originalIdx] = givenList[originalIdx], givenList[maxNum-1]
        changedCnt += 1

    visited.append(maxNum)

    if changedCnt >= cnt:
        answer = str(givenList[originalIdx]) + ' ' + str(givenList[maxNum-1])
        break

print(answer)




