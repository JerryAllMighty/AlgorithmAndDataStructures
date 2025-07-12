from collections import deque


# def island_dfs_stack(grid):
#     dx = [0,0,1,-1]
#     dy = [1,-1,0,0]
#     rows, cols = len(grid), len(grid[0])
#     cnt = 0
#
#     for row in range(rows):
#         for col in range(cols):
#             if grid[row][col] != '1':
#                 continue
#
#             cnt += 1
#             stack = [(row,col)]
#
#             while stack:
#                 x, y = stack.pop()
#                 grid[x][y] = '0'
#                 for i in range(4):
#                     nx = x + dx[i]
#                     ny = y + dy[i]
#                     if nx < 0 or nx >= rows or ny < 0 or ny >= cols or grid[nx][ny] != '1':
#                         continue
#                     stack.append((nx,ny))
#         return cnt
#
#
# def island_bfs(grid):
#     dx = [0, 0, 1, -1]
#     dy = [1, -1, 0, 0]
#     rows, cols = len(grid), len(grid[0])
#     cnt = 0
#
#     for row in range(rows):
#         for col in range(cols):
#             if grid[row][col] != '1':
#                 continue
#
#             cnt += 1
#             q = deque([(row, col)])
#
#             while q:
#                 x, y = q.popleft()
#                 for i in range(4):
#                     nx = x + dx[i]
#                     ny = y + dy[i]
#                     if nx < 0 or nx >= rows or ny < 0 or ny >= cols or grid[nx][ny] != '1':
#                         continue
#                     grid[nx][ny] = '0'
#                     q.append((nx, ny))
#     return cnt

def island_stack(graph):
    x = [0, 1, 0, -1]
    y = [1, 0, -1, 0]
    answer = 0
    for i in range(len(graph)):
        for j in range(len(graph[i])):
            if graph[i][j] == 0:
                continue

            def change(xx, yy):

                if graph[xx][yy] == 0:
                    return

                graph[xx][yy] = 0

                for k in range(4):
                    dx = xx + x[k]
                    dy = yy + y[k]

                    if dx < 0 or dx > len(graph)-1 or dy < 0 or dy > len(graph[0])-1:
                        continue

                    change(dx, dy)

            change(i, j)
            answer +=1

    return answer

print(island_stack([[1,1,0,0,0],[1,1,0,0,0],[0,0,1,0,0],[0,0,0,1,1]]))









