kanCnt, dolCnt = list(map(int, input().split(' ')))
lst = ['*' for _ in range(kanCnt)]
cur = 0
for _ in range(dolCnt):
    changedCnt, letter = input().split(' ')
    # calculate where the number stands the next time
    idx = (cur + int(changedCnt)) % kanCnt
    cur = idx
    if lst[idx] == '*':
        lst[idx] = letter
    elif lst[idx] != letter:
        lst = '!'
lst1 = [i for i in reversed(range(cur+1, kanCnt))]
lst2 = [i for i in reversed(range(0, cur+1))]
answers = []
if lst != '!':
    for i in lst2:
        if lst[i] == '*':
            answers.append('?')
        else:
            answers.append(lst[i])


    for i in lst1:
        if lst[i] == '*':
            answers.append('?')
        else:
            answers.append(lst[i])

    print(''.join(answers))
else:
    print(lst)