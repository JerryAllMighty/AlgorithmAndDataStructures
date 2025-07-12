n, m = map(int, input().split(' '))

basket = [i for i in range(1, n+1)]

for i in range(m):
    start, end = map(int, input().split(' '))
    # 해당 구간은 역순으로 정렬
    tempList= basket[start-1:end]
    #for j in range(start-1, end):
     #   val = tempList.pop()
      #  basket[j]= val
    basket[start-1:end] = tempList[::-1]

print(*basket)
