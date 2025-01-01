import sys
from collections import defaultdict

from HideAndSeek import hide

with open('testcase_hide.txt') as f:
    sys.stdin = f
    input = sys.stdin.readline

    N, M = map(int, input().split())
    graph = defaultdict(list)
    for _ in range(M):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    print(hide(graph))  # (4, 2, 3)