def solution(lst):

    for p in range(len(lst)):
        min = lst[p]
        for i in range(p, len(lst)):
            if lst[i] < min :
                min = lst[i]
                lst[p], lst[i] = lst[i], lst[p]
                print(lst)
    return lst
# 2
print(solution([4, 6, 2, 9, 1]))