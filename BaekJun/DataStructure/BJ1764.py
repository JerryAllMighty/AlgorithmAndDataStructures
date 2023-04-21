from collections import defaultdict
import heapq
n, m = map(int, input().split(' '))

d = defaultdict(bool)

answers = []

for _ in range(n):
    target = input()
    d[target] = True


for _ in range(m):
    target = input()

    if d[target]:
        heapq.heappush(answers, target)



cnt = len(answers)

print(cnt)

for _ in range(cnt):
    print(heapq.heappop(answers))