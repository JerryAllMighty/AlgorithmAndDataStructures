given = int(input())

cnt =0
answer = '' 
while True:
  if given == 3 or given == 6 or given == 9 :
    answer ='YES'
    break
  elif given > 9:
    temp = 0
    for i in str(given):
      temp += int(i)
      
    given = temp
  else:
    answer ='NO'
    break
    
  
  cnt += 1
  
print(cnt)
print(answer) 