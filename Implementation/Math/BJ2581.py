m = int(input())
n = int(input())


lst = []
# 에라토스테네스의 체
primeList = [i for i in range(2, n+1)]
for j in primeList:
  i = 2
  while True:
    if i * j > n:
      break
    
    if i * j in primeList:
      primeList.remove(i*j)
    
    i += 1 
    
    
  
  
for i in range(m, n+1):
  if i in primeList:
    lst.append(i)
    
    

  
if len(lst) == 0:
  print(-1)
else:
  print(sum(lst), min(lst))