size, cnt = map(int, input().split())
lst = list(map(int, input().split()))

orders = [i for i in range(size)]
for _ in range(cnt):
    rules = list(map(int, input().split()))
    temp = [0 for _ in range(size)]
    if rules[0] == 1:
        lst[rules[1]-1] += rules[2]
    elif rules[0] == 2:
        for i in range(size):
            idx = (i + rules[1]) % size
            orders[i] = idx
    elif rules[0] == 3:
        for i in range(size):
            idx = (i - rules[1]) % size
            orders[i] = idx

answer = [lst[i] for i in orders]
print(*answer)