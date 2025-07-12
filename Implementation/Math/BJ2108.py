import collections


cnt = int(input())
lst = []
for _ in range(cnt):
  num = int(input())
  lst.append(num)
  
print(round( sum(lst)/cnt))
lst.sort()
print(lst[len(lst)//2])
if len(lst) > 1:
  mostTwo = collections.Counter(lst).most_common(n=2)
  if mostTwo[0][1] == mostTwo[1][1]:
    print(mostTwo[1][0])
  else:
    print(mostTwo[0][0])
else:
  print(lst[0])
print(max(lst) - min(lst))