mid = int(input()) 
answers = []
for i in range(1, mid+1):
  answer = ' '* (mid-i) + '*' * (2*i-1) 
  answers.append(answer)
for j in answers:
  print(j)