# # 32140	2428
# n, k = map(int, input().split())
#
# finalLst = list(map(int, input().split()))
# shuffleOrder = list(map(int, input().split()))
# answers = [chr(97+i) for i in range(n)]
# lst = [i for i in answers]
# for _ in range(k):
#     temp = [i for i in lst]
#     for i in range(n):
#         lst[i] = temp[shuffleOrder[i]-1]
#
# for j in answers:
#     idx = lst.index(j)
#     print(finalLst[idx],end=' ')


import sys

input = lambda: sys.stdin.readline().rstrip()
g = lambda: [*map(int, input().split())]

N, K = g()
S = g()
D = [*map(lambda x: int(x) - 1, input().split())]
ans = [0] * N
for i in range(N):
    if ans[i]:
        continue
    cycle = [i]
    now = i
    while D[now] != i:
        now = D[now]
        cycle.append(now)
    for idx in range(len(cycle)):
        from_idx = cycle[idx]
        to_idx = cycle[(idx + K) % len(cycle)]
        ans[to_idx] = S[from_idx]
print(*ans)
