cnt, length = map(int, input().split(' '))
lst = []
for _ in range(cnt):
  each = input()
  lst.append(each)
  
distList = []
for i in range(cnt-1):
  dist = 0
  for j in range(i, cnt):
    for k in range(length):
      a = lst[i][k]
      b = lst[j][k]
      if lst[i][k] != lst[j][k]:
        dist += 1
        
    distList.append(dist)
  
  
print(min(distList))
    
  