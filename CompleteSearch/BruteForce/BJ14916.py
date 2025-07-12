n = int(input())

five_wons = n // 5
money_left = n - (5 * five_wons)

if money_left % 2 == 0:
    two_wons = money_left // 2
else:
    if five_wons != 0:
        five_wons-=1
        two_wons = (money_left+5) // 2
    else:
        two_wons = -1
        

print(five_wons + two_wons)

