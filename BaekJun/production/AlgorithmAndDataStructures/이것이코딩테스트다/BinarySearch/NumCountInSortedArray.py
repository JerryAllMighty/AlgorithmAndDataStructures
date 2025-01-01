import bisect


def solution(s, lst):
    cnt  = 0
    n, x = s.split(' ')
    index = bisect.bisect_left(lst, int(x))
    if index < 0 or index > len(lst) -1:
        return -1

    while index < len(lst):
        if lst[index] == int(x):
            cnt +=1
            index +=1
        else:
            break

    return cnt

print(solution('7 2', [1,1,2,2,2,2,3]))