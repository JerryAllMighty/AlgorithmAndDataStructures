n = int(input())

cnt = 0
for i in range(1, n+1):
  current = 0
  while True:
    current += i
    if current < n:
      i += 1
    elif current == n:
      cnt +=1
    else:
      break
    
    
print(cnt)
      
    
    
  
  