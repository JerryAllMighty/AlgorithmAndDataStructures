import math
x, y = map(int, input().split(' '))

z = math.floor( (y/x) * 100)

answer = 0
while True:
  if z == 100:
    answer = -1
    break
  cmp = math.floor((y+answer)/(x+answer) * 100)
  if cmp != z:
    break
  else:
    answer = answer +1
    
    
print(answer)
  
  
