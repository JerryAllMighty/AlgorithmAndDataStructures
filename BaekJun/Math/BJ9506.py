def isPerfectNum(num):
    yaksu = []
    days = ''
    for i in range(1, num):
        if num % i == 0:
            yaksu.append(i)

    if sum(yaksu) == num:
        for j in yaksu:
            days += ' ' + str(j) + ' ' + '+'

        days = str(num) + ' ' + '=' + days[:-2]
    else:
        days = str(num) + ' is NOT perfect.'

    return days

while True:
    try:
        num = int(input())
        if num == -1:
            break

        days = isPerfectNum(num)
        print(days)

    except EOFError:
        break



