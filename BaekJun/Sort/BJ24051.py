import sys

n, m = map(int, sys.stdin.readline().split(' '))
givenList = list(map(int, sys.stdin.readline().split(' ')))

cnt = 0

for i in range(n - 1):
    for j in range(i + 1, n):
        val = givenList[j]
        if val < givenList[i]:
            idx = j
            while (idx > i):
                changedNum = givenList[idx - 1]
                givenList[idx] = changedNum
                idx -= 1
                cnt += 1

                if cnt == m:
                    print(changedNum)
                    exit(0)

            givenList[i] = val
            cnt += 1

            if cnt == m:
                print(val)
                exit(0)
print(-1)
