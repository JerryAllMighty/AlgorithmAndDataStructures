cnt = int(input())
answers = []
def factorial(n):
  answer = 1
  for i in range(1, n+1):
    answer *= i
  return answer
for _ in range(cnt):
  x, y =  map(int, input().split(' '))
  answers.append(factorial(y)//(factorial(y-x) * factorial(x)))
  
  
for j in answers:
  print(j)