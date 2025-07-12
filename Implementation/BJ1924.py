month, day = map(int, input().split(' '))

available = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

dayGap = day
if month == 1:
    print(available[dayGap % 7])
else:
    for i in range(1, month):
        if i == 1 or i == 3 or i == 5 or i == 1 or i == 7 or i == 8 or i == 10 or i == 12:
            dayGap += 31
        elif i == 4 or i == 6 or i == 9 or i == 11:
            dayGap += 30
        elif i == 2:
            dayGap += 28



    print(available[dayGap % 7])
