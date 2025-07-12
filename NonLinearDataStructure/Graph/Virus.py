num = input()
pairs = input()
connectedList=[]
for _ in range(int(pairs)):
    aa = input().split()
    connectedList.append(aa)
print(connectedList)
def HowManyInfected(num, pairs, connectedList):
    infectedList = ['1']
    for pair in connectedList:
        if pair[0] in infectedList and pair[1] not in infectedList:

            infectedList.append(pair[1])
            print(infectedList)
            continueinfectedList = ['1']
    for pair in connectedList:
        if pair[0] in infectedList and pair[1] not in infectedList:

            infectedList.append(pair[1])
            print(infectedList)
            continue
    return len(infectedList) -1
    return len(infectedList) -1

print(HowManyInfected(num,pairs,connectedList))
#[[1,2],[2,3],[1,5],[5,2],[5,6],[4,7]]

