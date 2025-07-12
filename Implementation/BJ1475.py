num  = input()

sets = [i for i in range(0,10)]
answer = 1


def refill(num):
    for j in range(0, 10):
        sets.append(j)
    sets.remove(num)

for i in num:
    if int(i) in sets:
        sets.remove(int(i))

    elif int(i) not in sets:
        if i == '6':
            if 9 in sets:
                sets.remove(9)
                continue

        elif i == '9':
            if 6 in sets:
                sets.remove(6)
                continue

        refill(int(i))
        answer += 1




print(answer)

