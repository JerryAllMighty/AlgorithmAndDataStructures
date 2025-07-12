import sys
input = sys.stdin.readline

N = int(input())
ls = [0] * 10001
for i in range(N):
    ls[int(input())] += 1
for i in range(10001):
    for n in range(ls[i]):
        print(i)