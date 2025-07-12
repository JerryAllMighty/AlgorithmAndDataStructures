each = float(input())

cnt = int(input())
answer = 0
for _ in range(cnt):
    w, h = map(float, input().split(' '))
    answer += each * w * h


print(float(answer))