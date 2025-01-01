import math


def yaksuCnt(num):
    if num == 1 :
        return 1
    days = [1, num]
    for i in range(2, math.floor(num ** 0.5) + 1):
        if num % i == 0:
            if i not in days:
                days.append(i)
            if (num // i) not in days:
                days.append((num // i))
    return len(days)


lst = []


def solution(number, limit, power):
    for i in range(1, number + 1):
        cnt = yaksuCnt(i)
        if cnt > limit:
            lst.append(power)
        else:
            lst.append(cnt)

    return sum(lst)


print(solution(5, 3, 2))
