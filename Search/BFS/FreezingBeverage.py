def solution(lst):
    cnt =0
    dir = [(0,1),(0,-1),(-1,0),(1,0)]
    def dfs(li, x, y):
        if x < 0 or x > len(lst) - 1 or y < 0 or y > len(lst[0])-1:
            return False
        if li[x][y] != 0:
            return False
        li[x][y] = 1

        for i in dir:
            dx = x + i[0]
            dy = y + i[1]
            dfs(li, dx, dy)
        return True

    for i in range(len(lst)):
        for j in range(len(lst[0])):
            if dfs(lst, i, j):
                cnt +=1

    return cnt
print(solution([[0,0,1,1,0],[0,0,0,1,1],[1,1,1,1,1],[0,0,0,0,0]]))
