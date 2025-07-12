a = input()
b = input()

temp = ''
for i in range(8):
  temp += a[i] + b[i]
  
idx = 0
current = ''
limit = len(temp)
while True:
  if limit == 2:
    break
  elif idx < limit-1:
    current += str(int(temp[idx])+int(temp[idx+1]))[-1]  
    idx += 1
  else:
    temp = current
    current = ''
    idx = 0
    limit = len(temp)
    
print(temp)