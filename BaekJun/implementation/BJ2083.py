answers = []
while True:
    try:
        name, age, weight = input().split(' ')
        if name == '#':
            break

        if int(age) > 17 or int(weight) >= 80:
            answers.append(name + ' ' + 'Senior')
        else:
            answers.append(name + ' ' + 'Junior')
       
    except EOFError:
        break


for i in answers:
    print(i)