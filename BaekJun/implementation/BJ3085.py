cnt = map(int, input())
targets = []

for _ in range(cnt):
    row = list(input())
    targets.append(row)

for row in range(cnt):
    for col in range(cnt):
        # we choose 2 with different colors
        # row and column
        if col != cnt - 1 and targets[row][col] != targets[row][col+1]:


        # row and row
        if row != cnt-1 and targets[row][col] != targets[row+1][col]:
            targets[row+1], targets[row] = targets[row], targets[row+1]


    # we change them.


