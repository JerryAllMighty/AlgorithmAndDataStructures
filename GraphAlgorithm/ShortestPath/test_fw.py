import sys

with open('testcase_floyd.txt') as f:
    INF = int(1e9)
    sys.stdin = f
    input = sys.stdin.readline

    N = int(input())
    M = int(input())

    dist = [[INF] * (N + 1) for _ in range(N + 1)]

    for i in range(1, N + 1):
        dist[i][i] = 0

    for _ in range(M):
        a, b, c = map(int, input().split())
        if c < dist[a][b]:
            dist[a][b] = c

    for k in range(1, N + 1):
        for a in range(1, N + 1):
            for b in range(1, N + 1):
                dist[a][b] = min(dist[a][b], dist[a][k] + dist[k][b])

    for row in dist[1:]:
        print(' '.join([str(el) if el != INF else '0' for el in row[1:]]))