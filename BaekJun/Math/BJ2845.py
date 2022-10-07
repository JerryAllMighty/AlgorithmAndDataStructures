import sys
people, distance = map(int, sys.stdin.readline().rstrip().split(' '))
cmp = people * distance


lst = list(map(int, sys.stdin.readline().rstrip().split(' ')))
for i in lst:
    print(i - cmp)
