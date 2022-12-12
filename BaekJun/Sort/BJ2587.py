lst = []

for _ in range(5):
    num = int(input())
    lst.append(num)

lst.sort()
print(sum(lst)//5, lst[2])