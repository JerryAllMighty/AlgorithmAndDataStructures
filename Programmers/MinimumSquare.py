def solution(sizes):
    x = max([i[0] for i in sizes])
    y = max([i[1] for i in sizes])

    for j in range(len(sizes)):
        garo = [i[0] for i in sizes]
        sero = [i[1] for i in sizes]
        garo[j], sero[j] = sero[j], garo[j]

        tempX = max(garo)
        tempY = max(sero)

        x = min(x, tempX)
        y = min(y, tempY)


    return x * y


print(solution([[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]))

