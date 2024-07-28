n, m = map(int, input().split(' '))

lst = [i for i in range(1, n + 1)]
cnt = 0
idx = -1
answer = '<'
while (lst):
    cnt += 1
    idx += 1
    idx = idx % len(lst)
    if cnt % m == 0:
        answer += str(lst[idx]) + ',' + ' '
        lst.pop(idx)
        idx -= 1

answer = answer[:len(answer)-2] + '>'
print(answer)

