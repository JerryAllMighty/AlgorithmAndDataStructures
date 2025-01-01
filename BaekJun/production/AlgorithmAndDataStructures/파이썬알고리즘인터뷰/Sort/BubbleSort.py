def solution(lst):

    for ii in range(len(lst)-1):
        for i in range(len(lst) - ii -1):
            if lst[i] > lst[i+1] :
                lst[i], lst[i+1] = lst[i+1], lst[i]

    return lst

print(solution([4, 6, 2, 9, 1]))