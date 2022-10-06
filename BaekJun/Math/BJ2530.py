import sys
h, m, s = map(int, sys.stdin.readline().rstrip().split(' '))
time = int(sys.stdin.readline().rstrip())

s += time

if s >= 60:
    m += s // 60
    s  %= 60

if m >= 60:
    h += m // 60
    m %= 60

if h >= 24:
    h %= 24


print(' '.join([str(h), str(m), str(s)]))