cnt = int(input())
answers = []
for _ in range(cnt):
  h, w, n = map(int, input().split())
  a = (n % h)
  b = (n // h) + 1
  if (n % h == 0):
    b -= 1
    a = h
    
  answers.append((a*100)+b)

for i in answers:
  print(i)
