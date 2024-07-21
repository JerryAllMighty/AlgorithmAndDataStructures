
nm = list(map(int, input().split(' ')))

lst = ['0' for i in range(nm[0])]

for i in range(nm[1]):
    given = list(map(int, input().split(' ')))
    start = given[0] - 1
    end = given[1] - 1
    ball = given[2]

    for j in range(start, end+1):
        lst[j] = str(ball)


print(*lst)





