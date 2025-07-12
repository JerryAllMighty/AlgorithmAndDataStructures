cnt = int(input())

lst = list(map(int, input().split(' ')))
lst.sort()

print(' '.join([str(i) for i in lst]))