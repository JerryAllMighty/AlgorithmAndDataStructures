total = int(input())
answers = []
for _ in range(total):
    cnt = int(input())
    cmp = 0
    target = ''
    for _ in range(cnt):
        a, b = input().split(' ')
        if int(a) > cmp:
            cmp = int(a)
            target = b

    answers.append(target)


for j in answers:
    print(j)