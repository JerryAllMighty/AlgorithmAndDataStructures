from sys import stdin

memberCnt = int(stdin.readline().rstrip())
members= []
for _ in range(memberCnt):
    each = stdin.readline().rstrip()
    members.append(each)



members.sort(key=lambda x:int(x.split(' ')[0]))
for i in members:
    print(i)