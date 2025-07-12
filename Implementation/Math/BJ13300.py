import sys
total, limit = map(int, sys.stdin.readline().rstrip().split(' '))

temp = []
answer = 0
for _ in range(total):
    gender, grade= map(int, sys.stdin.readline().rstrip().split(' '))
    temp.append([gender, grade])
    
    

for i in range(1, 7):
    girl = 0
    boy = 0
    for j in temp:
        if j[1] == i:
            if j[0] == 0:
                if girl ==0:
                    answer += 1
                    girl += 1
                elif girl < limit:
                    girl += 1
                else:
                    answer += 1
                    girl = 1
            else:
                if boy ==0:
                    answer += 1
                    boy += 1
                elif boy < limit:
                    boy += 1
                else:
                    answer += 1
                    boy = 1

print(answer)