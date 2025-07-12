cnt = int(input())
answers = []
for _ in range(cnt):
    eachCnt = int(input())
    lst = list(map(int, input().split(' ')))
    
    answers.append(sum(lst))

for i in answers:
    print(i)