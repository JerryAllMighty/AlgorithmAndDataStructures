import sys
cnt = int(sys.stdin.readline().rstrip())
for i in range(1, cnt+1):
  a, b = map(int, sys.stdin.readline().rstrip().split())
  print(str.format("Case #{}: {} + {} = {}", i, a, b, a+b))