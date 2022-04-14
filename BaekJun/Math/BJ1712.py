import sys
import math
a,b,c = map(int, sys.stdin.readline().rstrip().split())
if c -b <= 0:
  print(-1)

elif a%(c-b) == 0:
  print( int(a/(c-b) + 1))
else:
  print( math.ceil(a/(c-b)))
