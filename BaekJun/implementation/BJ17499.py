size, cnt = map(int, input().split())
lst = list(map(int, input().split()))

for _ in range(cnt):
    rules = list(map(int, input().split()))
    temp = [0 for _ in range(size)]
    if rules[0] == 1:
        lst[rules[1]-1] += rules[2]
    elif rules[0] == 2:
        # 23401
        gap = rules[1] - 1
        lst = [lst[(i + gap) % size] for i in range(size)]
    elif rules[0] == 3:
        # 1234 0
        gap = rules[1]
        lst = [lst[(i + gap) % size] for i in range(size)]
print(*lst)