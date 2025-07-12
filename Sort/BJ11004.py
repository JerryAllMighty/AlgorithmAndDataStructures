cnt, th = map(int, input().split(' '))

lst = list(map(int, input().split(' ')))
lst.sort()
print(lst[th-1])