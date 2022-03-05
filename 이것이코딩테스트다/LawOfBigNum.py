def solution(n,m,k, lst):
    sum = 0
    idx= 0
    continuousCnt = 0
    lst = list(reversed(sorted(lst)))
    for _ in range(m):
        if continuousCnt == k:
            sum += lst[idx+1]
            continuousCnt = 0
            continue
        sum += lst[idx]
        continuousCnt +=1
    return sum

print(solution(5,8,3,[2,4,5,4,6]))