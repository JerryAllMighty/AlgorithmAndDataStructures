cnt = int(input())

answer = []


for _ in range(cnt):
  person, log = input().split(' ')
  if log == 'enter':
    answer.append(person)
  else:
    answer.remove(person)
    
answer.sort(reverse=True)

for i in answer:
  print(i)