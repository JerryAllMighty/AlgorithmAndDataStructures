n = int(input())
lst = list(map(int, input().split()))
everyLst = []


# 모든 순열 조합을 구한다.
def recursive(temp):
    cnt = n
    while(cnt > 0):

        cnt -= 1


lst.sort()
tmp = []
tmp.append(lst[0])
recursive(tmp)
idx = everyLst.index(lst)
if idx != 0:
    print(everyLst[idx - 1])
else:
    print(-1)
