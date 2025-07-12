import sys
kg = int(sys.stdin.readline().rstrip())

target = 0
if (target / 5) == 0:
  target = 
rest = kg - (target * 5)
target2 = rest // 3


print(target + target2)