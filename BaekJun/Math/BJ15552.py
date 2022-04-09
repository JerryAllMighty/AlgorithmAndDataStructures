import sys
cnt = int(sys.stdin.readline().rstrip())
for _ in range(cnt):
  a, b = map(int, sys.stdin.readline().rstrip().split())
  print(a + b)