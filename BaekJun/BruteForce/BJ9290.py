cnt  = int(input())
answers = []

for i in range(1, cnt+1):
    lst = []
    visited = []
    for _ in range(3):
        each = input().strip()
        lst.append(each)
    
    # x인지 o인지
    target = input().strip()

    rows = []
    columns = []


    for j in range(len(lst)):
        for k in range(len(lst[j])):
            # 현재 인덱스 파악
            if lst[j][k] == target:
                rows.append(j)
                columns.append(k)

    # 가로
    if rows[0] == rows[1]:
        lst[rows[0]] = target * 3

    #세로
    elif columns[0] == columns[1]:
        for q in range(3):
            if lst[q][columns[0]] == '-':
                newRow = list(lst[q])
                newRow[columns[0]] = target
                lst[q]=''.join(newRow )

    #대각선
    else:
        targetRow = 0
        targetColumn = 0
        for q in range(3):
            if q not in rows:
                targetRow = q

            if q not in columns:
                targetColumn = q

        newRow= list(lst[targetRow])
        newRow[targetColumn] = target
        lst[targetRow] = ''.join(newRow)


    answers.append('Case'+ ' ' + str(i) +':')
    for u in lst:
        answers.append(u)

for h in answers:
    print(h)
        







            
                
                


    




    
