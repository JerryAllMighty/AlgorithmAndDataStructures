from collections import defaultdict
cnt = int(input())

for _ in range(cnt):
  n = int(input())
  nList = list(map(int, input().split(' ')))
  nDict =defaultdict(bool)
  for i in nList:
    nDict[i] = True
  m = int(input())
  mList = list(map(int, input().split(' ')))
  for j in mList:
    if nDict.get(j) == True:
      print(1)
    else:
      print(0)
  
  