cnt = int(input())
answers = []

def LargestGap(targetList):
    gap = 0
    for idx in range(len(targetList)-1):
        adjGap = abs(targetList[idx] - targetList[idx+1])
        if adjGap > gap:
            gap = adjGap

    return str(gap)

for i in range(cnt):
    lst = list(map(int, input().split(' ')))[1:]
    answer = 'Class' + ' ' + str(i+1) + '\n'
    answer += 'Max ' + str(max(lst)) + ',' + ' Min ' + str(min(lst)) + ', ' + 'Largest gap '
    lst.sort(reverse=True)
    result = LargestGap(lst)
    answer += result

    answers.append(answer)


for p in answers:
    print(p)



