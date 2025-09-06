import sys
total, continuous = sys.stdin.readline().rstrip().split(' ')
each = sys.stdin.readline().rstrip().split(' ')

lists = []
for i in range(int(total)-int(continuous)+1):
  sum = 0
  for j in range(i, i + int(continuous)):
    sum += int(each[j])
    
  lists.append(sum)
  
print(max(lists))
  