start1 = input()
start2 = input()
term1 = input()
term2 = input()


days = ['Saturday', 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday']
dayIdx1 = 0
dayIdx2 = 0
available1 = []
available2 = []
h, m = start1.split(':')
h1, m1 = term1.split(':')
h3, m3 = start2.split(':')
h4, m4 = term2.split(':')


while True:
    
    h = int(h) + int(h1)
    m = int(m) + int(m1)


    
    if m >= 60:
        h += 1
        m = m % 60

    if h > 23:
        h = h % 24
        dayIdx1 += 1
        dayIdx1 = dayIdx1 % 7

    

    if (h, m, days[dayIdx1]) not in available1:

        available1.append((h, m, days[dayIdx1]))
    else:
        break



while True:    
    h3 = int(h3) + int(h4)
    m3 = int(m3) + int(m4)


    
    if m3 >= 60:
        h3 += 1
        m3 = m3 % 60

    if h3 > 23:
        h3 = h3 % 24
        dayIdx2 += 1
        dayIdx2 = dayIdx2 % 7

    if (h3, m3, days[dayIdx2]) not in available2:
        available2.append((h3, m3, days[dayIdx2]))
    else:
        break



bFlag = False
for j in available1:
    if j in available2:
        bFlag = True
        if str(j[1]) == '0':
            print(j[2])
            print(str(j[0]) + ':' + '00')
        else:
            print(j[2])
            print(str(j[0]) + ':' + str(j[1]))

        break

if bFlag == False:
    print('Never')

