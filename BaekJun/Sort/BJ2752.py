import sys

lst = list(map(int, sys.stdin.readline().rstrip().split(' ')))

lst.sort()

print(' '.join([str(i) for i in lst]))

