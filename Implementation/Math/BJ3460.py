cnt  = int(input())
answers = []
for _ in range(cnt):
    target = int(input())
    binaryNum = format(target, 'b')
    answer = []
    for idx, val in enumerate(binaryNum[::-1]):
        if val =='1':
            answer.append(str(idx))

    answers.append(answer)


for p in answers:
    print(' '.join(p))


