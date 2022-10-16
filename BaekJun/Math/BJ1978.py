cnt = int(input())
lst = list(map(int, input().split(' ')))
answer = 0
for i in lst:
  if i == 1:
    continue
  # i가 소수인지 판별
  bFlag = False
  for j in range(2, i):
    if i % j == 0:
      bFlag = True
      
  if bFlag == False:
    answer += 1
    
print(answer)

