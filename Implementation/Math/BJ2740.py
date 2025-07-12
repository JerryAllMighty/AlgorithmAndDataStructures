n, m = map(int, input().split())
a = []
for _ in range(n):
    lst = list(map(int, input().split()))
    a.append(lst)


m, k = map(int, input().split())
b = []
for _ in range(m):
    lst = list(map(int, input().split()))
    b.append(lst)

answer = []

for i in range(n):
    eachList = []
    for p in range(k):
        each = 0
        for j in range(m):
            each += a[i][j] * b[j][p]

        eachList.append(each)

    answer.append(eachList)

for q in answer:
    print(' '.join([str(i) for i in q]).strip())

        
