n = int(input())
subjects = []
for _ in range(n):
    subjects.append(input().split())

m = int(input())

answers = []
for _ in range(m):
    answer = 0
    availble = input().split()
    for i in subjects:
        availbleLst = [availble[i] for i in range(1, len(availble))]
        subjectsLst = [i[j] for j in range(1,len(i))]
        bFlag = True
        for j in subjectsLst:
            if j not in availbleLst:
                bFlag = False
                break

        if bFlag is True:
            answer += 1
    answers.append(answer)

for j in answers:
    print(j)
