answers = []
cnt = 1
status = ''

while True:
    alpha, amount = input().split(' ')

    if alpha.isnumeric():
        normal, current = int(alpha), int(amount)

    if alpha == '#' and amount == '0':
        answers.append(str(cnt) +' '+ status)
        cnt += 1
        #초기화
        status = ''
        continue
    elif alpha == '0' and amount == '0':
        break



    if status == 'RIP':
        continue

    if alpha == 'E':
        current -= int(amount)
    elif alpha == 'F':
        current += int(amount)

    if current > normal * 1/2 and current < 2 * normal:
        status = ':-)'
    elif current <= 0:
        status = 'RIP'
    else:
        status = ':-(' 

    
for i in answers:
    print(i)

        
    
