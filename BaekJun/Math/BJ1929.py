import collections
from os import system
import sys
m, n = list(map(int, sys.stdin.readline().rstrip().split(' ')))

everyNum = collections.deque([i for i in range(2, n+1)])
answers = [i for i in range(2, n+1)]

while everyNum:
    one = everyNum.popleft()
    # 배수들 모두 지우기
    for j in range(2, (n//one)+1):
        target = j * one
        if target in answers:
            answers.remove(target)
    

for k in answers:
    if k >= m:
        print(k)

