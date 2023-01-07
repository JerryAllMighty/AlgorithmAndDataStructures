num = int(input())

targetNum = 1
for i in reversed(range(2, num+1)):
  targetNum *= i

cnt = 0
for idx in reversed(range(len(str(targetNum)))):
  if str(targetNum)[idx] != '0':
    break
  
  cnt += 1
  
  
print(cnt)