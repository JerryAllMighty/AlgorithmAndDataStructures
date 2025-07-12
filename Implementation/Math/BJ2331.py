a, p = map(int, input().split(' '))

lst = [a]
idx = 0
answer = 0
while True:
    target = 0
    for i in str(lst[idx]):
        target += int(i) ** p


    if target in lst:
        answer = lst.index(target)
        break
    else:
        lst.append(target)


    idx += 1


print(answer)