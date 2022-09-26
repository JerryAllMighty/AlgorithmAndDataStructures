import sys
import math

length, h, w = map(int,sys.stdin.readline().rstrip().split(' '))

print(str(math.floor(   ((length ** 2) * (w **2)/(w ** 2 + h ** 2)) ** (1/2) * (h/w) )) +' '+ str(math.floor(   ((length ** 2) * (w **2)/(w ** 2 + h ** 2)) ** (1/2) )))



