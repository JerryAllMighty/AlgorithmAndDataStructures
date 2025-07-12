def calcCol(column):
    result = ''

    if column >= 1 and column <= 26:
        return chr(64 + column)
    else:
        # 26번째까지 카운트.넘어가면 한자리씩 추가
        return (column//26) + calcCol((column%26))


while (True):
    try:
        rowCol = input()
        if rowCol.__eq__('R0C0'):
            exit(0)
        row = rowCol.split('C')[0]
        col = calcCol(int(rowCol.split('C')[1]))
        print(col + row[1:])
    except EOFError:
        break
