from sys import stdin

num = stdin.readline().strip()
answer = 0
for i in range(len(num)):
    target = int(num[i])
    if answer + target < answer * target:
        answer = answer * target
    else:
        answer += target

print(answer)