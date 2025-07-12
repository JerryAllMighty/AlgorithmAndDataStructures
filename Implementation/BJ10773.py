n = int(input())
lst = []
for i in range(n):
    m = int(input())
    if m == 0 and len(lst) > 0:
        lst.pop()
    else:
        lst.append(m)

print(sum(lst))


