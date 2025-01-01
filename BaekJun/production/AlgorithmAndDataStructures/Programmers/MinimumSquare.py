def solution(sizes):
    row = 0
    col = 0
    for a, b in sizes:
        if a < b:
            a, b = b, a
        row = max(row, a)
        col = max(col, b)
    return row * col

print(solution([[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]))

