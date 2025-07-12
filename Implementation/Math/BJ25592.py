cnt  = int(input())


# 1, 3, 5, 7, 9


idx = 1
win = False

while True:
    cnt -= idx
    if win == False:
        win = True
    else:
        win = False

    
    if cnt <= 0:
        break
    idx += 1

if win == True:
    print(abs(cnt))
else:
    print(0)