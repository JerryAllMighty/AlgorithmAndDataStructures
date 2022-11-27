# 1
# 343324	1280

cnt1, cnt2 = map(int, input().split(' '))
a = list(map(int, input().split(' ')))
b = list(map(int, input().split(' ')))

# 파이썬에서는 이렇게 리스트끼리 더하기가 된다는 것이 신기...
c = a+b

c.sort()

[print(i, end=' ') for i in c]