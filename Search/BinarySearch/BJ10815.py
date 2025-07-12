from collections import defaultdict

n = int(input())
nList = list(map(int, input().split(' ')))

nDict = defaultdict(bool)
for i in nList:
  nDict[i] = True

m = int(input())
mList = list(map(int, input().split(' ')))

answers = []

for i in mList:
  if nDict[i]:
    answers.append(1)
  else:
    answers.append(0)
    
    
print(*answers)

