import sys

cnt = int(sys.stdin.readline().rstrip())

answer = 1e9

for _ in range(cnt):
    lst = list(map(int, sys.stdin.readline().rstrip().split(' ')))

    gap = lst[1] - lst[0]
    if gap >= 0 and lst[1] < answer:
        answer= lst[1]


if answer == 1e9:
    print(-1)
else:
    print(answer)
        


    