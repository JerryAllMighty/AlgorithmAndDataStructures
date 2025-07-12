cnt = int(input())

lst = []


for _ in range(cnt):
    lst.append(int(input()))

lst.sort()

for j in lst:
    print(j)