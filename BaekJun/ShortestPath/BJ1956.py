import sys
from collections import deque

V, E = map(int, sys.stdin.readline().split(' '))
graph = []
for _ in range(E):
    s, e, c = map(int, sys.stdin.readline().split(' '))
    graph.append((s, e, c))

INF = int(1e9)
dist = [[INF] * (V + 1) for _ in range(V + 1)]

for i in range(len(dist)):
    for j in range(len(dist[i])):
        if i == j:
            dist[i][j] = 0

cyclable = []
visited = []

def recur(s):
    for i in graph:
        if i[0] == s:
            recur(i[1])

