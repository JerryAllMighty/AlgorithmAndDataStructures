total = int(input())

answers = []

for _ in range(total):
    eachOne = input()

    if len(eachOne) < 6 or len(eachOne) > 9:
        answers.append('no')
    else:
        answers.append('yes')

for i in answers:
    print(i)