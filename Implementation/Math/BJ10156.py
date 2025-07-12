each, cnt, current = map(int, input().split(' '))

need = (each * cnt)-current
if need >= 0:
    print(need)
else:
    print(0)