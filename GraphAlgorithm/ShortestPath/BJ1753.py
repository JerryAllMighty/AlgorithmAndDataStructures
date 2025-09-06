import heapq
import sys
from collections import deque

V, E = map(int, sys.stdin.readline().split(' '))
K = int(sys.stdin.readline())
graph = []
for _ in range(E):
    # s, e, c
     start, end, cost = map(int, sys.stdin.readline().split(' '))
     graph.append((start, end, cost))

INF = int(1e9)
dist = [INF if i != K else 0 for i in range(V+1)  ]
graph.sort()
# 축적 비용, 노드
q = [(dist[K], K)]
while q:
    one = heapq.heappop(q)
    if one[0] <= dist[one[1]]:
        dist[one[1]] = one[0]
    else:
        continue

    for i in range(len(graph)):
        if graph[i][0] == one[1]:
            heapq.heappush(q, (one[0]+graph[i][2], graph[i][1]))
        elif graph[i][0] > one[1]:
            break


# print(dist)
for  i in range(1, len(dist)):
    if dist[i] == INF:
        print('INF')
    else:
        print(dist[i])