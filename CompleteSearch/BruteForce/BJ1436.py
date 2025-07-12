n = int(input())


def is666(n):
  n = str(n)
  answer = False
  for i in range(len(n)-2):
    if n[i] == '6' and n[i+1] == '6' and n[i+2] == '6':
      answer = True
      
  return answer


lst = [666]
i = 1
while True:
  cmp = 666 + i
  if is666(cmp) :
    lst.append(cmp)
  
  if len(lst) == n:
    break
  
  i += 1
  
print(lst[len(lst)-1])
      
      
      
      
  
  
  
  