n, k = map(int, input().split())

finalLst = list(map(int, input().split()))
shuffleOrder = list(map(int, input().split()))
answers = [chr(97+i) for i in range(n)]
lst = [i for i in answers]
for _ in range(k):
    temp = [i for i in lst]
    for i in range(n):
        lst[i] = temp[shuffleOrder[i]-1]

for j in answers:
    idx = lst.index(j)
    print(finalLst[idx],end=' ')


