import heapq


def mars(graph):
    dr = [1,0,-1,0]
    dc = [0,1,0,-1]

    #노드 간 나올 수 없는 값, 무한 값을 주기
    N = len(graph)
    dist = [[int(1e9)] * N for _ in range(N)]

    q = []
    dist[0][0] = graph[0][0]
    heapq.heappush(q, (graph[0][0], 0,0))
    while q:
        #축적된 값, 좌표
        acc, r, c = heapq.heappop(q)

        if dist[r][c] < acc:
            continue

        for i in range(4):
            nr = r + dr[i]
            nc = c + dc[i]
            if 0 <= nr < N and 0 <= nc < N:
                cost = dist[r][c] + graph[nr][nc]
                #방문하지 않았던 곳이라면
                if cost < dist[nr][nc]:
                    dist[nr][nc] = cost
                    heapq.heappush(q, (cost, nr, nc))

    return dist[N-1][N-1]
# from collections import deque


# def mars(graph):
#     #상화좌우를 비교, 가장 값이 작은 것을 선택해서 이동할 수 있게
#     #우 하 좌 상 순서
#     x = [0,1,0,-11]
#     y = [1,0,-1,0]
#
#     #코스트, 좌표
#     q = deque([graph[0][0], ])
#
#     while q:
#         one = heapq.heappop(q)
#         for i in range(4):
#             heapq.heappush(q, graph[][])