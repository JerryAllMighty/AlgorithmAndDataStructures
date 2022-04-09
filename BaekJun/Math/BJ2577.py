import sys
from collections import Counter
num = 1
for _ in range(3):
  num = num *int(sys.stdin.readline().rstrip())

for i in range(10):
  pr = Counter(str(num)).get(str(i))
  if pr == None:
    print(0)
  else:
    print(pr)
