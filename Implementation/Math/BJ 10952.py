from logging import exception
import sys
while True:
  try:
    a, b = map(int, sys.stdin.readline().rstrip().split())
    
    if a == 0 and b == 0:
      break
    
    print(a+b)
  except EOFError:
    break