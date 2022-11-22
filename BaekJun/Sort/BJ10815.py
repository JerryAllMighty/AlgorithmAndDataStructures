cnt = int(input())

lst = set(map(int, input().split(' ')))

total = int(input())

targets = set(map(int, input().split(' ')))

answers = []

for i in targets:
  if i in lst:
    answers.append('1')
  else:
    answers.append('0')
    
print(' '.join(answers))