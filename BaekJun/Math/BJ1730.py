cnt = int(input())

cmd = list(input())

lst = [['.' for _ in range(cnt)] for _ in range(cnt)]
row = 0
col = 0

def move(row, col, dir):
    if lst[row][col] == '.' and (dir == 'U' or dir == 'D'):
        lst[row][col] = '|'
    elif lst[row][col] == '.' and (dir == 'L' or dir == 'R'):
        lst[row][col] = '-'
    elif (lst[row][col] == '|' and dir == 'L' or dir == 'R') or (lst[row][col] == '-' and dir == 'U' or dir == 'D'):
        lst[row][col] = '+'

for i in cmd:
    if i == 'U':
        if row > 0:
            move(row, col, i)
            row -= 1
    elif i == 'D':
        if row < cnt-1:
            move(row, col, i)
            row += 1
    elif i == 'L':
        if col > 0:
            move(row, col, i)
            col -= 1
    elif i == 'R':
        if col < cnt-1:
            move(row, col, i)
            col += 1


print(lst)