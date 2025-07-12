n = int(input())
givenList = []
answers = []

for i in range(n):
    weight, height = map(int, input().split(' '))
    givenList.append((weight, height))

givenList.sort(key=lambda x: (x[0], x[1]), reverse=True)

rank = 0
nextRank = 0
answers = []
for i in range(0,n-1):
    val = givenList[i]
    cmp = givenList[i+1]
    if val[0] > cmp[0] and val[1] > cmp[1]:
        rank += nextRank
        answers.append(rank)
        rank += 1
    else:
        answers.append(rank)
        nextRank += 1







