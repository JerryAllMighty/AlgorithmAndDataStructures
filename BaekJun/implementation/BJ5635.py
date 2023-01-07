cnt = int(input())
lst = []
for _ in range(cnt):
  info = list( input().split(' '))
  lst.append(info)
  
lst.sort(key=lambda x:(int(x[3]), int(x[2]), int(x[1])))
oldest = lst[0][0]
youngest = lst[cnt-1][0]

print(youngest)
print(oldest)

  