from ctypes import sizeof
import sys
cnt = 0
before = set()
for _ in range(10):
  a = int(sys.stdin.readline().rstrip())
  before.add(a%42)

print(len(before))