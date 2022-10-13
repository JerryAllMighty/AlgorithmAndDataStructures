n = int(input())

answer=[]
for i in range(1, n+1):
    each = ' ' * (abs(i-n)) + '*' + ' ' * (2*(i-1)-1) + '*'
    if i == 1:
        each = each[:-1]
    answer.append(each)

for j in answer:
    print(j)

