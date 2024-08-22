k, l, n = map(int, input().split())
data = input()
flushTime = []
currentTime = 0
isUse = False
idx = -1
lastFlushIdx = n - 1
while (idx < n):
    idx += 1
    if idx <= n - k:
        if data[idx:idx + k] == '1' * k:
            isUse = True
            for j in range(idx + k, n):
                if data[j:j + l] == '0' * l:
                    flushTime.append(j + l)
                    idx = j + l - 1
                    isUse = False
                    lastFlushIdx = j + l
                    break

# 사용중인 것이 남았을 떄
if isUse is True:
    cnt = data[lastFlushIdx:].count('0')
    flushTime.append(n + (l - cnt))
    idx -= 1

if len(flushTime) == 0:
    print('NIKAD')
    exit(0)
# 오름차순 정렬
flushTime.sort()
for s in flushTime:
    print(s)
