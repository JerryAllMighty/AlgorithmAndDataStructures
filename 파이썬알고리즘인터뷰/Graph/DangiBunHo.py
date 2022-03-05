import collections


def dd(n, list):
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    rows = len(list)
    cols = len(list[0])


    cnt = 0
    for row in range(rows):
        for col in range(cols):
            if list[row][col] != '1':
                continue

        cnt += 1
        q = collections.deque([(row, col)])

        while q:
            c,d = q.popleft()
            for i in range(4):
                x = c + dx[i]
                y = d + dy[i]
                if x < 0 or x >= rows or y < 0 or y >= cols or list[x][y] != '1':
                    continue
                list[x][y] = '0'
                q.append((x, y))
    return cnt
print(dd(7, [['0110100'], ['0110101'], ['1110101'],
             ['0000111'], ['0100000'], ['0111110'],
             ['0111000']]))
