import math
import sys
n, m= map(int, sys.stdin.readline().split(' '))
lst = list(map(int, sys.stdin.readline().split(' ')))


big= max(lst)
small = 0

while big != small:
    mid = math.ceil((big+small)/2)
    take = sum([int(i-mid) for i in lst if i > mid])
    if take > m:
        small = mid
    elif take < m:
        big = mid
    else:
        print(mid)
        break