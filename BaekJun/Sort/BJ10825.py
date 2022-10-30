cnt = int(input())

scores = []
for _ in range(cnt):
    lst = list(input().split(' '))
    scores.append(lst)


scores.sort(key = lambda x : (-int(x[1]),int(x[2]),-int(x[3]), x[0]))

for j in scores:
    print(j[0])