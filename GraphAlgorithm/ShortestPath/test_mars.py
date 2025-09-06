
import sys

from MarsInvestigation import mars

with open('testcase_mars.txt') as f:
    sys.stdin = f
    input = sys.stdin.readline

    T = int(input())
    for _ in range(T):
        N = int(input())
        graph = []
        for __ in range(N):
            graph.append(list(map(int, input().split())))
        # print(graph)
        print(mars(graph))