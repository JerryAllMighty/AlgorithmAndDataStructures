n, m = map(int, input().split(' '))

lst = []
answer = []

for _ in range(n+m):
  name = input()
  if name not in lst:
    lst.append(name)
  else:
    answer.append(name)

answer.sort()

for j in answer:
  print(j)
    