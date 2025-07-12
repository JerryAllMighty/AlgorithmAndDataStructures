from collections import defaultdict
import sys

n = int(sys.stdin.readline().rstrip())
nList = list(map(int, sys.stdin.readline().rstrip().split(' ')))

m = int(sys.stdin.readline().rstrip())
mList = list(map(int, sys.stdin.readline().rstrip().split(' ')))


nDict = defaultdict(int)

for i in nList:
    if nDict.get(i) == None:
        nDict[i] = 1
    else:
        nDict[i] = nDict.get(i)+1


for j in mList:
    num = nDict.get(j)
    if num != None:
        print(num, end=' ')
    else:
        print(0, end = ' ')
