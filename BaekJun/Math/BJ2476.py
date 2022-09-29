import sys
cnt = int(sys.stdin.readline().rstrip())
lst = []
for _ in range(cnt):
    price = 0
    a,b,c = map(int,sys.stdin.readline().rstrip().split(' '))
    if a == b and b== c:
        price = 10000 + (b * 1000)
    elif a == b and a != c :
        price = 1000 + (b * 100)
    elif a == c and  a != b :
        price = 1000 + (a * 100)
    elif b == c and a != c:
        price = 1000 + (b * 100)
    else:
        price = (max([a,b,c]))*100
        

    lst.append(price)

print(max(lst))