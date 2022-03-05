def solution(HY, lst):
    H = int(HY.split(' ')[0])
    Y = int(HY.split(' ')[1])
    max = lst[0][0]
    maxHang = ''
    for i in range(H):
        for j in range(Y):
            if lst[i][j] > max:
                max = lst[i][j]
                maxHang = i
    return min(lst[int(maxHang)+1])

print(solution('3 3', [[3,1,2],[4,1,4],[2,2,2]]))