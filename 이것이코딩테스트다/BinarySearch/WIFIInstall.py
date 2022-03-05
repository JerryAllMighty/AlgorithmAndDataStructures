from sys import stdin

houseCnt, wifiCnt = stdin.readline().rstrip().split(' ')
houses = []
for _ in range(int(houseCnt)):
    each = int(stdin.readline().rstrip())
    houses.append(each)

houses.sort()


