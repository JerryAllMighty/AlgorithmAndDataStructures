import sys

total, cnt  = sys.stdin.readline().rstrip().split(' ')
eachNum = sys.stdin.readline().rstrip().split(' ')
answers = []
for _ in range(int(cnt)):
  start, end = sys.stdin.readline().rstrip().split(' ')
  answer = 0
  for i in range(int(start)-1, int(end)):
    answer += int(eachNum[i])
    
  answers.append(answer)
  
[print(i) for i in answers]
    


