cnt  = int(input())


# 1, 3, 5, 7, 9


idx = 1

while True:
    cnt -= idx
    if cnt <= 0:
        break
    idx += 1

print(abs(cnt))