
cnt = int(input())

answers = []

for _ in range(cnt):
    target = input()

    lst = []
    closed = []
    for i in target:
        if i == '(':
            lst.append(i)
        else:
            if lst:
                lst.pop()
            else:
                closed.append(i)


    if lst or closed:
        answers.append('NO')
    else:
        answers.append('YES')
    
for i in answers:
    print(i)


    
    

    

    

        