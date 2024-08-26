n = int(input())
lst = [
    list(map(int, input().split()))
    for _ in range(n)
]
answer = 10 ** 9
for i in range(1, len(lst) - 1):
    temp = 0
    idx = 0
    while (idx < n - 1):
        x1 = lst[idx][0]
        y1 = lst[idx][1]
        if idx + 1 == i:
            x2 = lst[idx + 2][0]
            y2 = lst[idx + 2][1]
            idx += 2
        else:
            x2 = lst[idx + 1][0]
            y2 = lst[idx + 1][1]
            idx += 1

        temp += abs(x1 - x2) + abs(y1 - y2)
    if temp < answer:
        answer = temp
print(answer)

# tup = []
# for i in range(n - 1):
#     a, b = (i, i + 1)
#     c = abs(lst[i][0] - lst[i + 1][0]) + abs(lst[i][1] - lst[i + 1][1])
#     tup.append([(a, b), c])
# everySum = sum([i[1] for i in tup])
#
# j = 1
# answer = everySum
# while (j < n - 1):
#     temp = everySum - (tup[j - 1][1] + tup[j][1]) + (
#             abs(lst[j + 1][0] - lst[j - 1][0]) + abs(lst[j + 1][1] - lst[j - 1][1]))
#     if temp < answer:
#         answer = temp
#     j += 1

print(answer)
