cnt = int(input())

isSpace = False
for _ in range(cnt):
    if isSpace == False:
        isSpace = True
        print('* ' * cnt)
    else:
        isSpace = False
        print(' *' * cnt)