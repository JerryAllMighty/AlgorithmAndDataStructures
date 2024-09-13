# 31120	72 python3
n = int(input())
lst = []
for _ in range(n):
    name, bun = input().split()
    lst.append((name, bun))

while (len(lst) > 1):
    a, b = lst.pop(0)
    cnt = 0
    while (True):
        c, d = lst.pop(0)
        cnt += 1
        if cnt < int(b):
            lst.append((c, d))
        else:
            break


print(lst[0][0])


