import sys
cnt = int(sys.stdin.readline().rstrip())
lst = []
answer = 0
lst = list(map(int, sys.stdin.readline().rstrip().split(' ')))

counted = []
for i in lst:
    if i not in counted:
        cnt = lst.count(i)
        if cnt > 1:
            answer += cnt-1
            counted.append(i)


print(answer)
