import sys
big = -1
idx = -1
for i in range(1, 10):
  each = int(sys.stdin.readline().rstrip())
  if each > big:
    big = each
    idx = i

print(big)
print(idx)

