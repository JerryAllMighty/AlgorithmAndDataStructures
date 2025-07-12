n = int(input())
idx = 2
lst = [0 , 1]
while len(lst) <= n :
  num = lst[idx-1] + lst[idx-2]
  lst.append(num)
  idx += 1
  
print(lst[n])
  