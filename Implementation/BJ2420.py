import sys

a, b = list(map(int, sys.stdin.readline().rstrip().split(' ')))
print(abs(a-b))