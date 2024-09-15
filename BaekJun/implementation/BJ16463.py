import calendar

n = int(input())

lst = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']


def isYoon(year):
    if (year % 400 == 0) or (year % 100 != 0 and year % 4 == 0):
        return True
    elif (year % 400 != 0) or (year % 100 == 0):
        return False
    else:
        return False


def count13Friday(year, yoil, isYoon):
    result = 0
    month = 1
    day = 1
    friday = 0
    friIdx = lst.index('Fri')
    yoilIdx = lst.index(yoil)
    if friIdx > yoilIdx:
        friday = friIdx - yoilIdx + 1
    elif friIdx == yoilIdx:
        friday = 1
    else:
        friday = (7 - yoilIdx) + friIdx
    while (True):
        if friday < 13:
            friday += 7
        elif friday == 13:
            result += 1
        else:
            if month in [1, 3, 5, 7, 8, 10, 12]:
                day += 31
            elif month == 2:
                if isYoon:
                    day += 29
                else:
                    day += 28
            else:
                day += 30


answer = 0
for _ in range(2019, n + 1):
    firstYoil = 'Tue'
    answer += count13Friday(_, firstYoil, isYoon(_))

print(answer)
