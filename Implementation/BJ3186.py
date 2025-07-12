k, l, m = map(int, input().split())

lst = input()
# if len(lst) == 0:
#     print('NIKAD')
isUsed = False
flushLst = []
lastFlushIdx = m - 1
idx = 0
while (idx < m):
    # 사용중
    val = lst[idx:idx + k]
    if lst[idx:idx + k] == '1' * k:
        isUsed = True
        for j in range(idx + k, m):
            if lst[j:j + l] == '0' * l:
                flushLst.append(j + l)
                lastFlushIdx = j + l
                idx = j + l - 1
                isUsed = False
                break
    idx += 1

if isUsed is True:
    # 연속된 0의 개수가 몇개인지
    isUnused = False
    cnt = 0
    for i in range(lastFlushIdx, m):
        val = lst[i]
        if isUnused is True and val == '0':
            cnt += 1
        if val == '0':
            isUnused = True
            cnt += 1
        else:
            cnt = 0
            isUnused = False

    flushLst.append(m + (l - cnt))

if flushLst:
    flushLst.sort()
    for i in flushLst:
        print(i)
else:
    print('NIKAD')
