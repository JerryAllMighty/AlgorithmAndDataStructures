n = int(input())
lst = [
    list(map(int, input().split()))
    for _ in range(n)
]
tup = []
for i in range(n - 1):
    a, b = (i, i + 1)
    c = abs(lst[i][0] - lst[i + 1][0]) + abs(lst[i][1] - lst[i + 1][1])
    tup.append([(a, b), c])
everySum = sum([i[1] for i in tup])

j = 1
answer = everySum
while (j < n - 1):
    temp = everySum - (tup[j - 1][1] + tup[j][1]) + (
            abs(lst[j + 1][0] - lst[j - 1][0]) + abs(lst[j + 1][1] - lst[j - 1][1]))
    if temp < answer:
        answer = temp
    j += 1

print(answer)
