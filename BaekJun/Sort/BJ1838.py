cnt = int(input())

lst = list(map(int, input().split(' ')))
current = 1
while current < cnt:
  changed = False
  for i in range(current, len(lst)):
    if lst[i] < lst[i-1]:
      lst[i], lst[i-1] = lst[i-1], lst[i]
      changed = True
  
    if changed == False:
      break
  current += 1  
  
print(current-1)
  