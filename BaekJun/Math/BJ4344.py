import sys
import statistics
import math
cnt = int(sys.stdin.readline().rstrip())

for _ in range(cnt):
  each = list(map(int, sys.stdin.readline().rstrip().split()))
  avg = statistics.mean(each[1:])
  over = 0
  for i in range(1, len(each)):
    if each[i] > avg:
      over += 1
  
  print(f"{((over/(len(each)-1))*100):.3f}"+"%")

