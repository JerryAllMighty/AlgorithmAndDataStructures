cnt = int(input())
lst = []
for _ in range(cnt):
  strList = input().split(' ')
  lst.append(strList)
  
  
lst.sort(key= lambda x: int(x[1]))

indexList = [i[0][int(i[2])-1].upper() for i in lst]

print(''.join(indexList))
  