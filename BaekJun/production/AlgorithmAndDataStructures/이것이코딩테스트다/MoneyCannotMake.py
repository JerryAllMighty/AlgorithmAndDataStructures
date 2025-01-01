from collections import deque


def solution(cnt, lst):
    s = 1
    lst.sort()
    visited = []
    for i in range(cnt):
        if lst[i] not in visited:
            visited.append(lst[i])
        for j in range(i, cnt):
            if lst[i] + lst[j] not in visited:
                visited.append(lst[i]+lst[j])
    visited.sort()
    while True:
        if s in visited:
            s +=1
            continue
        else:
            break
    return s

print(solution(5, [3,2,1,1,9]))

