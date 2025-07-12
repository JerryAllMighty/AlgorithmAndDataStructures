import sys
n, m =map(int, sys.stdin.readline().rstrip().split(' '))
nList = set()
answer = 0

while True:
  num = sys.stdin.readline().rstrip()
  if ' ' in num: 
    a, b = num.split(' ')
    if a == '0' and b == '0':
      break
    
  else:
    if len(nList) != n:
      nList.add(num)
    else:
      if num in nList:
        answer += 1
    
    
print(answer)