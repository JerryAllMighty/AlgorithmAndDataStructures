lst = []
for _ in range(2):
    a = int(input())
    lst.append(a)

sum = 0
gap = 0
multiple = 1

for j in range(len(lst)):
    sum += lst[j]
    multiple *= lst[j]
    if j == 0:
        gap += lst[j]
    else:
        gap -= lst[j]
    

print(sum)
print(gap)
print(multiple)