kanCnt, dolCnt = list(map(int, input().split(' ')))
lst = ['*' for _ in range(kanCnt)]
cur = 0
for _ in range(dolCnt):
    changedCnt, letter = input().split(' ')
    # calculate where the number stands the next time
    idx = kanCnt - abs(cur - int(changedCnt))
    cur = idx
    if lst[idx] == '*':
        lst[idx] = letter
    else:
        lst = '!'


for i in lst:
    if i == '*':
        print('?')
    else:
        print(i)

