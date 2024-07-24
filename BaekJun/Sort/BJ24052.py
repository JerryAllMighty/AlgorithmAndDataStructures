N, M = map(int, input().split())
lst = list(map(int, input().split()))


def insertion_sort(lst):  # A[1..N]을 오름차순 정렬한다.
    for i in range(1, N):
        loc = i - 1
        newItem = lst[i]

        # 이 지점에서 A[1..i-1]은 이미 정렬되어 있는 상태
        while (1 <= loc and newItem < lst[loc]):
            lst[loc + 1] = lst[loc]
            loc -= 1

        if (loc + 1 != i):
            lst[loc + 1] = newItem


insertion_sort(lst)
