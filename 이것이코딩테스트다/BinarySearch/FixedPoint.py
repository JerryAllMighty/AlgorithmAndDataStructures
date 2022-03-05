def solution(n, lst):
    left, right = 0,len(lst) -1
    while left < (left+right)//2:
        mid = (left+right)//2
        if lst[mid] > mid:
            right = mid
        elif lst[mid] < mid:
            left = mid
        else:
            return mid
    return -1

print(solution(7, [-15, -6,1,3,7]))
