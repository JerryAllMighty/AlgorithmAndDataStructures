cnt = int(input())
answers = []
for i in reversed(range(1, cnt+1)):
  answers.append(' ' * (cnt-i) + i * '*')
  
for j in answers:
  print(j)