import sys
cnt = int(input())

lst = list(map(int, sys.stdin.readline().rstrip().split(' ')))
answer = []
for i in range(cnt):
    answer.insert(i - lst[i], i+1)

print(' '.join([str(i) for i in answer]).rstrip())


