answers = []
while True:
    try:
        target = input()
        if target =='0':
            break

        if target == target[::-1]:
            answers.append('yes')
        else:
            answers.append('no')

    except EOFError():
        break

for i in answers:
    print(i)