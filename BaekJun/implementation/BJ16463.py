import calendar

n = int(input())


# 2019 01 01 Tue
def count13Friday(year, firstFriday):
    result = 0

    # 매달마다 금요일의 날짜를 구해 13일인지 체크
    month = 1
    while (month < 13):
        firstFriday += 7
        if firstFriday == 13:
            result += 1
        else:
            if month in [1, 3, 5, 7, 8, 10, 12]:
                daysOfEachMonth = 31

            elif month == 2:

                if (year % 400 != 0 and year % 100 == 0):
                    daysOfEachMonth = 28
                # 윤년
                elif year % 400 == 0 or (year % 100 != 0 and year % 4 == 0):
                    daysOfEachMonth = 29
                else:
                    daysOfEachMonth = 28
            else:
                daysOfEachMonth = 30

            if firstFriday > daysOfEachMonth:
                firstFriday = firstFriday - daysOfEachMonth
                month += 1
    return result


answer = 0
fridayEachYear = 4

for i in range(2019, n + 1):
    answer += count13Friday(i, fridayEachYear)
    if i % 4 != 0:
        fridayEachYear -= 1
    else:
        fridayEachYear -= 2
print(answer)
