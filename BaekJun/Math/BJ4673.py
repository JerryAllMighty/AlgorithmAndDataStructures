def recursive(num):
  return num + sum([int(i) for i in str(num)])

answers = []
for i in range(1, 10001):
  result = i
  while result < 10000:
    result = recursive(result)
    if result not in answers:
      answers.append(result)

for j in range(1, 10000):
  if j not in answers:
    print(j)
  
    
  
  