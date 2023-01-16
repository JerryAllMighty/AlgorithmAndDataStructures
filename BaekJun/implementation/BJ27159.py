cnt = int(input())

lst = list(map(int, input().split(' ')))
  
lst.sort()
answer = 0
for i in range(len(lst)):
  if i != 0:
    if lst[i] -1 != lst[i-1]:
      answer += lst[i]
  else:
    answer += lst[i]
      
      
print(answer)
      
    
      
      
    