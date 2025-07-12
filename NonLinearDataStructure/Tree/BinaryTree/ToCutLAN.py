import math
from sys import stdin

cur, goal = stdin.readline().rstrip().split(' ')
Lans = []
for _ in range(int(cur)):
    each =  int(stdin.readline().rstrip())
    Lans.append(each)

Lans = list(reversed(sorted(Lans)))
target = Lans[0]
big =[]
small = []
while True:
    cnt = 0
    for i in Lans:
        cnt += (i // target)
    if cnt < int(goal):
        big.append(target)
        target = (target//2)
    elif cnt > int(goal):
        if big:
            prev = big[len(big)-1]
            target += (prev - target)//2
        else:
            target += target

    else:
        break

print(target)