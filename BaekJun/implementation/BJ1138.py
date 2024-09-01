n = int(input())
tallerLst = list(map(int, input().split()))
lst = [i for i in range(1, n + 1)]


def findIdx(num, cnt):
    idx = 0
    targetCnt = 0
    for i in range(len(answer)):
        if answer[i] == 0:
            if targetCnt == cnt:
                return i
            else:
                targetCnt += 1


    return idx


answer = [0 for i in range(n)]
for i in range(len(lst)):
    if answer[tallerLst[i]] == 0:
        answer[tallerLst[i]] = lst[i]
    else:
        idx = findIdx(lst[i], tallerLst[i])
        answer[idx] = lst[i]

print(*answer)
