cnt = int(input())

lst = []
for _ in range(cnt):
  x, y = map(int, input().split(' '))
  lst.append([x, y])
  
lst.sort(key = lambda x: (x, y))

for i in lst:
  print(' '.join([str(i[0]), str(i[1])]))