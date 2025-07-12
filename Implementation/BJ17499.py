size, cnt = map(int, input().split())
lst = list(map(int, input().split()))

gap = 0
for _ in range(cnt):
    rules = list(map(int, input().split()))
    temp = [0 for _ in range(size)]
    if rules[0] == 1:
        aa = (rules[1]-1-gap)%size
        lst[aa] += rules[2]
    elif rules[0] == 2:
        gap += rules[1]
        # lst = [lst[(i + gap) % size] for i in range(size)]
    elif rules[0] == 3:
        gap -= rules[1]
        # lst = [lst[(i + gap) % size] for i in range(size)]
# 01234
# 23401
answer = [0 for _ in range(size)]
for i in range(size):
    aa = (i+gap)%size
    answer[aa] = lst[i]
print(*answer)