import math


def yaksuCnt(num):
    if num == 1 :
        return 1
    result = [1, num]
    for i in range(2, math.floor(num ** 0.5) + 1):
        if num % i == 0:
            if i not in result:
                result.append(i)
            if (num // i) not in result:
                result.append((num // i))
    return len(result)


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
