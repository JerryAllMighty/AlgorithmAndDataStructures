import sys
n, m = map(int, sys.stdin.readline().rstrip().split(' '))
lst = []
answers = []

for _ in range(n * 2):
    eachOne = list(map(int, sys.stdin.readline().rstrip().split(' ')))
    lst.append(eachOne)


for i in range(n):
    temp = ''
    for j in range(m):
        summed = lst[i][j] + lst[i+n][j]
        temp += str(summed) + ' '
    
    answers.append(temp[:-1])


for p in answers:
    print(p)
