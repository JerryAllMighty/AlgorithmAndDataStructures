cnt = int(input())

answer = 0
for _ in range(cnt):
    day = input()
    if int(day.split('-')[1]) < 90:
        answer += 1


print(answer)
