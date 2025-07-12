n, k, a, b = map(int, input().split())

lst = [k for _ in range(n)]
idx = 0
answer = 1
while (True):
    cnt = 1
    while (cnt <= a):
        minVal = min(lst)
        minIdx = lst.index(minVal)
        lst[minIdx] += b
        cnt += 1
    lst = [i - 1 for i in lst]
    zeroCnt = 0
    for i in lst:
        if i <= 0:
            print(answer)
            exit(0)

    answer += 1
