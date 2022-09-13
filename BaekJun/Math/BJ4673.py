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

# 문제를 통확하기는 했지만, 반복문이 너무 많아 시간복잡도가 좋지않다.
# 그대로 쓰지 말고 개선해서 쓰자.
  
    
  
  