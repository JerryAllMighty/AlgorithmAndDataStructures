cnt = int(input())
time = list(map(int, input().split(' ')))

time.sort()

answer = 0
current = 0
for i in time:
  current += i
  answer += current
  
print(answer)