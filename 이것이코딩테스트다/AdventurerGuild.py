from sys import stdin

num = int(stdin.readline())
Gongpos = []

for _ in range(num):
    Gongpo = stdin.readline()
    Gongpos.append(Gongpo)

Gongpos.sort()
cnt = 0
group = []
for i in Gongpos:
    group.append(i)
    if i <= len(group):
        group = []
        cnt +=1

print(cnt)



