import math
import sys

n, m = map(int, sys.stdin.readline().rstrip().split())

for i in range(n, m + 1):
    if i == 1:  # 1은 소수가 아니므로 제외
        continue
    maxNum = math.floor(i ** (1 / 2))
    isPrime = True
    for j in range(2,maxNum+1):
        if i % j == 0:
            isPrime = False
            break
    if isPrime is True:
        print(i)

