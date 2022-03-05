def solveNQueens(n: int):
    visited = [-1] * n
    cnt = 0
    answers = []
    def is_ok_on(nth_row):
        for row in range(nth_row):
            if visited[nth_row] == visited[row] or nth_row - row == abs(visited[nth_row] - visited[row]):
                return False
        return True

    def dfs(row):
        if row >= n:
            nonlocal cnt
            cnt += 1
            print('*' * 80)
            print(f"{cnt}번째 답 - visited: {visited}")
            grid = [['.'] * n for _ in range(n)]
            for idx, value in enumerate(visited):
                grid[idx][value] = 'Q'
            result = []
            for row in grid:
                print(row)
                result.append(''.join(row))
            answers.append(result)
            return

        for col in range(n):
            visited[row] = col
            if is_ok_on(row):
                dfs(row + 1)

    dfs(0)
    return answers

print(solveNQueens(4))
