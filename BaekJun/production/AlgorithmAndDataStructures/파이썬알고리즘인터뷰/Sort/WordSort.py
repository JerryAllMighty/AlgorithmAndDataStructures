from sys import stdin

cnt = int(stdin.readline())
hh = []
for _ in range(cnt):
    oneword = stdin.readline().rstrip()
    if oneword not in hh:
        hh.append(oneword)

hh.sort(key=lambda x:(len(x), x))

for i in hh:
    print(i)