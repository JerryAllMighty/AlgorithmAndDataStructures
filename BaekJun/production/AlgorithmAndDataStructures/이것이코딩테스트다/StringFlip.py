import collections
from sys import stdin

target = stdin.readline().strip()

Hcnt = 0
Jcnt = 0
answer = ''


for i in range(len(target)):
    if target[i] == '1':
        Hcnt += 1
        if i == len(target)-1:
            continue
        if target[i+1] == '1':
            Hcnt -= 1
# 1100110010
    elif target[i] == '0':
        Jcnt += 1
        if i == len(target)-1:
            continue
        if target[i+1] == '0':
            Jcnt -= 1

print(min(Hcnt, Jcnt))



