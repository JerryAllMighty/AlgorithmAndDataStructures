# 31120	32
n = int(input())
answers = []
for i in range(n):
    price = int(input())
    # 5:10,10:6,20:4,50:3
    bills = input().split(',')
    bills.sort(key=lambda x: int(x.split(':')[0]), reverse=True)
    isDone = False
    temp = []
    while (bills and isDone is False):
        # Pick from the biggest bills and count as many as possible
        # 50:3
        bill, cnt = map(int, bills.pop(0).split(':'))
        answerCnt = 0
        isSkip = False
        while(cnt > 0):
            if price - bill > 0:
                answerCnt += 1
                price -= bill
                cnt -= 1
            elif price - bill == 0:
                isDone = True
                answerCnt += 1
                price -= bill
                cnt -= 1
                break
            else:
                if answerCnt == 0:
                    isSkip = True
                break
        if isSkip is False:
            temp.append(str(bill) + ' ' + str(answerCnt))

    if isDone is False:
        answers.append('Customer' + str(i + 1) + ':')
        answers.append('Impossible')
    else:
        answers.append('Customer' + str(i + 1) + ':')
        for i in temp:
            answers.append(i)
        temp = []

for i in answers:
    print(i)