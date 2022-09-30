cnt  = int(input())
lst = list(map(int, input().split(' ')))

y = 0
m = 0
# 10 20
# 15 30
for i in lst:
    y += i // 30 * 10 + 10
    m += i // 60 * 15 + 15


if y < m:
    print('Y', y)
elif y > m:
    print('M', m)
else:
    print('Y', 'M', y)
