def solution(n,m, lst):
    dir = [(0,1), (1,0),(0,-1),(-1,0)]
    cnt = 0
    def dfs(li,x,y):
        if x < 0 or x > len(lst)-1 or y < 0 or y > len(lst[0])-1:
            return False
        if li[x][y] != 1:
            return False
        nonlocal cnt
        cnt +=1
        if x == n-1 and y == m -1 :
            return True

        for i in dir:
            dx = x + i[0]
            dy = y + i[1]
            if dfs(li, dx, dy):
                break

        return True
    dfs(lst,0,0)
    return cnt

print(solution(5,6,[[1,0,1,0,1,0],[1,1,1,1,1,1],[0,0,0,0,0,1],[1,1,1,1,1,1],[1,1,1,1,1,1]]))
