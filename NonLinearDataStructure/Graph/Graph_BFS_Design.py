from collections import deque

graph = {
    1: [2, 3, 4],
    2: [5],
    3: [5],
    4: [],
    5: [6, 7],
    6: [],
    7: [3],
}

def bfs_queue(start):
    visited = [start]
    q = [start]

    while q:
        node = q.popleft()
        for adj in graph[node]:
            if adj not in visited:
                visited.append(adj)
                q.append(adj)
