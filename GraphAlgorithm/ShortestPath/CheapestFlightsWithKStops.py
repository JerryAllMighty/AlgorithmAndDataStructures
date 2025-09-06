import heapq
from collections import deque


def solution(n, edges, src, dst, K):
    # 1 K개의 경유지 이내에 도착하는 경우의 수
    kyj = -1
    # 경유횟수, 노드
    q = deque([(src, kyj)])
    visited = []
    while q:
        one = q.popleft()
        visited.append(one[0])
        for i in edges:
            if i[0] == one[0]:
                if one[1] <= K-1:
                    q.append((i[1],one[1]+1))
                else:
                    visited.pop()
    #2 그 중 가장 저렵한 수
    sum = 0
    print(list(sorted(edges, key= lambda x:(x[0] == 0 and x[1] == 2))))
    for i in range(len(visited)-1):
        sum += list(sorted(edges, key= lambda x:x[0] == i and x[1] == i+1))[0][2]

    return sum




    return visited

print(solution(3, [[0,1,100],[1,2,100],[0,2,500]],0,2,0))
