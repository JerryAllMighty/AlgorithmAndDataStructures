import sys

cnt = int(input())

answers = []
fiv = [1, 1]
for _ in range(cnt):
  num = int(input())
  
  for i in range(2, num+1):
    fivNum = fiv[i-1] + fiv[i-2]
    if fivNum not in fiv:
      fiv.append(fivNum)
    
  answers.append(fiv[num])
    
for i in answers:
  print(i)
  
  