n, m = input().split()
n = int(n)
m = int(m)

lst = [
    [i for i in input()]
    for _ in range(n)
]
answer = 1
for i in range(n):
    for j in range(m):
        val = lst[i][j]
        temp = ''
        for s in lst:
            temp += ''.join(s)
        cnt = temp.count(val)
        if cnt >= 4:
            for k in range(j + 1, m):
                if lst[i][k] == val:
                    for l in range(i + abs(k-j), n):
                        if lst[l][k] == val:
                            for r in range(k-1, j - 1, -1):
                                if lst[l][r] == val and (abs(l-i) == abs(k-r)):
                                    gap = (abs(l - i + 1)) * (abs(k-r + 1))
                                    if gap >= answer:
                                        answer = gap

print(answer)
