n, k = map(int, input().split())

result = list(map(int, input().split()))
order = list(map(int, input().split()))
cmp = [chr(97 + i) for i in range(n)]
init = [i for i in cmp]
answer = []
for i in range(k):
    temp = [i for i in cmp]
    for j in range(len(order)):
        cmp[j] = temp[order[j]-1]
for j in init:
    for i in range(len(cmp)):
        if j == cmp[i]:
            answer.append(result[i])
            continue

print(*answer)
