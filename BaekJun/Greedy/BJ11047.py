n, price = map(int, input().split())

lst = [
    int(input())
    for _ in range(n)
]
lst.sort(reverse=True)

answer = 0
idx = 0
tempMok = price // lst[idx]
while (True):
    if tempMok < 1:
        idx += 1
        tempMok = price // lst[idx]
    else:
        tempMok = price // lst[idx]
        if tempMok < 1:
            idx += 1
            tempMok = price // lst[idx]
            continue

        if (tempMok * lst[idx]) == price:
            answer += tempMok
            break

        else:
            price -= (tempMok * lst[idx])
            answer += tempMok
            idx += 1

print(answer)
