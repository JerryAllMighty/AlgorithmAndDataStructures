import sys
cnt = int(sys.stdin.readline().rstrip())
target = sys.stdin.readline().rstrip()
print(sum([int(i) for i in target]))
  