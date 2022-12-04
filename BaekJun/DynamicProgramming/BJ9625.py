cnt = int(input())

str = ['A']
for _ in range(1000000):
  str.append('0')
  
  
for i in range(cnt):
  
  idx = 0
  
  target = str[idx]
  while target != '0':
    if target == 'A':
      str[idx] = 'B'
      idx +=1
    else:
      str.insert(idx+1, 'A')
      idx += 2
    target = str[idx]
    
a = 0
b = 0

for i in str:
  if i == 'A':
    a +=1
  elif i == 'B':
    b +=1
  else:
    break
  
print(a, b)
  