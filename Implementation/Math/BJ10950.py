import sys
cnt = int(sys.stdin.readline())
for _ in range(cnt):
    a, b = list(map(int, sys.stdin.readline().split(' ')))
    print(a+b)