cnt = int(input())

cmd = list(input())

lst = [['.' for _ in range(cnt)] for _ in range(cnt)]
row = 0
col = 0

def move(row, col, dir):
    cur = lst[row][col]
    if cur == '.':
        if dir == 'U' or dir == 'D':
            lst[row][col] = '|'
        elif dir == 'L' or dir == 'R':
            lst[row][col] = '-'
    elif cur == '|':
        if dir == 'L' or dir == 'R':
            lst[row][col] = '+'
    elif cur == '-':
        if dir == 'U' or dir == 'D':
            lst[row][col] = '+'
for i in cmd:
    if i == 'U' and row > 0:
        move(row, col, i)
        move(row-1, col, i)
        row -= 1
    elif i == 'D' and row < cnt-1:
        move(row, col, i)
        move(row + 1, col, i)
        row += 1
    elif i == 'L' and col > 0:
        move(row, col, i)
        move(row, col-1, i)
        col -= 1
    elif i == 'R' and col < cnt - 1:
        move(row, col, i)
        move(row, col+1, i)
        col += 1


for i in lst:
    print(''.join(i))
