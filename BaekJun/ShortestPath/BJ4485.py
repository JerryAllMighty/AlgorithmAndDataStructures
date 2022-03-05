import heapq
import sys
from collections import deque

graph = []
while True:
    try:
        each = []
        cnt = int(sys.stdin.readline())
        if cnt == 0:
            break
        for _ in range(cnt):
            each.append(list(map(int, sys.stdin.readline().split(' '))))
        graph.append(each)
        
    except EOFError:
        break
x = [0,1,0,-1]
y = [1,0,-1,0]

for j in range(len(graph)):
    # (축적 값, 좌표)
    q = [(graph[j][0][0], (0,0))]
    visited = []
    done = False
    while q:
        while q:
            one = heapq.heappop(q)
            if one[1] not in visited:
                visited.append(one[1])
                break
        q = []

        for i in range(4):
            dx = one[1][0] + x[i]
            dy = one[1][1] + y[i]
            if dx < 0 or dy < 0 or dx > len(graph[j])-1 or dy > len(graph[j][0])-1:
                continue
            if dx == len(graph[j])-1 and dy == len(graph[j][0])-1:
                print(one[0]+graph[j][dx][dy])
                done = True
                break

            heapq.heappush(q, (one[0]+graph[j][dx][dy],(dx,dy)))

        if done:
            break

