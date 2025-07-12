import sys
import math
day, night, height = list(map(int, sys.stdin.readline().rstrip().split(' ')))


# 포인트는, 달팽이가 올라가야하는 길이가 height - night라는 것! 정상에 올라간 후에는 미끄러지지않기 때문이다. 
print(math.ceil((height - night)/(day - night) ))

