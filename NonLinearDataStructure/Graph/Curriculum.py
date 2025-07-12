import collections
import sys

n, m = map(int, sys.stdin.readline().split(' '))
teams = []
for _ in range(m):
    oper, a, b = map(int, sys.stdin.readline().split(' '))
    if oper == 0:
        teams.append((a,b))
    else:
        print((a,b) in teams)





