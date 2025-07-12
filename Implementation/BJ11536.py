cnt = int(input())

lst = []

for _ in range(cnt):
    name = input()
    lst.append(name)

cmp = lst.copy()
cmp2 = lst.copy()

cmp.sort()
cmp2.sort(reverse=True)

if lst == cmp:
    print('INCREASING')
elif lst == cmp2:
    print('DECREASING')
else:
    print('NEITHER')
