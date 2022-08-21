import sys

total, until = map(int, sys.stdin.readline().rstrip().split(' '))
everyNum = list(map(int, sys.stdin.readline().rstrip().split(' ')))

prefix_sum = [0]
sum = 0
for i in everyNum:
  sum += i
  prefix_sum.append(sum)
  
for _ in range(until):
  start, end = map(int, sys.stdin.readline().rstrip().split(' '))
  print(prefix_sum[end] - prefix_sum[start-1])
  
