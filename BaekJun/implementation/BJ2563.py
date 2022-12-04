cnt = int(input())

def checkDup(garo, sero):
  startX = 0
  endX = 0
  removeX = []
  for i in range(len(garo)-1):
    cnt  = garo.count(garo[i])
    if cnt > 1 and :
      if startX == 0:
        startX = garo[i]
      else:
        endX = garo[i]
        
      removeX.append(garo[i])
      garo.sort()
      

        
  startY = 0
  endY = 0
  removeY = []
  if startX != 0:
    for i in range(len(sero)-1):
      cnt  = sero.count(i)
      if cnt > 1:
        if startY == 0:
          startY = sero[i]
        else:
          endY = sero[i]
      
        removeY.append(sero[i])
        sero.sort()
        
        
  return startX * endX, startY * endY
      

garo = []
sero = []
answer = 0
for _ in range(cnt):
  g, y = map(int, input().split(' '))
  for i in range(g, g+11):
    garo.append(i)
  for i in range(y, y+11):
    sero.append(i)
    

  x, y = checkDup(garo, sero)
  answer += x * y
  
  
print(answer)
  
  