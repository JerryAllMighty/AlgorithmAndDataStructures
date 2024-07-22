
n, m = map(int, input().split(' '))
givenList =  list(map(int, input().split(' ')))
visited= []
cnt = 0
answer = '-1'
for i in reversed(range(n)):
    maxNum = 1
    maxIdx = 0
    for j in range(n):
        if givenList[j] > maxNum and givenList[j] not in visited:
            maxNum = givenList[j]
            maxIdx = j

    if maxIdx != i:
        givenList[maxIdx], givenList[i] = givenList[i], givenList[maxIdx]
        cnt +=1
    visited.append(maxNum)

    if cnt == m:
        answer = ' '.join(map(str, givenList))
        break
print(answer)






