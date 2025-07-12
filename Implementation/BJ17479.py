import sys
m, n, k = map(int, sys.stdin.readline().split())
normal = {}
for _ in range(n):
    name, price = sys.stdin.readline().split()
    normal[name] = int(price)

special = {}
for _ in range(m):
    name, price = sys.stdin.readline().split()
    special[name] = int(price)
service = {}
for _ in range(k):
    name = input()
    service[name] = name
cnt = int(input())
answer = 'Okay'
normalOrderPriceSum = 0
specialOrderPriceSum = 0
servicecnt = 0
orders = []
for _ in range(cnt):
    name = sys.stdin.readline().rstrip()
    if name in special:
        specialOrderPriceSum += special[name]
    elif name in normal:
        normalOrderPriceSum += normal[name]
    elif name in service:
        servicecnt += 1
    orders.append(name)
for i in orders:
    if i in special:
        if normalOrderPriceSum < 20000:
            answer = 'No'
    if i in service:
        if ((normalOrderPriceSum + specialOrderPriceSum) < 50000) or servicecnt > 1:
            answer = 'No'
print(answer)
