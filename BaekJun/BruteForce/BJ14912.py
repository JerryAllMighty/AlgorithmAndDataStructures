n, target = map(int, input().split(' '))

answer = 0
for i in range(1, n+1):
    answer += str(i).count(str(target))

print(answer)
