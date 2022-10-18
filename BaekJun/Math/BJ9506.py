def isPerfectNum(num):
    yaksu = []
    result = ''
    for i in range(1, num):
        if num % i == 0:
            yaksu.append(i)

    if sum(yaksu) == num:
        for j in yaksu:
            result += ' ' + str(j) + ' ' + '+'

        result = str(num) + ' ' + '=' + result[:-2]
    else:
        result = str(num) + ' is NOT perfect.'

    return result

while True:
    try:
        num = int(input())
        if num == -1:
            break

        result = isPerfectNum(num)
        print(result)

    except EOFError:
        break



