def solution(plans):
    answer = []

    currentSubject = ''
    currentStartMinute = 0
    currentDueMinute = 0

    for plan in plans:
        # 과제를 진행
        subject = plan[0]
        startMinute = int(plan[1].split(':')[0])*60 + int(plan[1].split(':')[1])
        dueMinute = int(plan[2])

        if startMinute < currentStartMinute + currentDueMinute:
            currentDueMinute -= startMinute - currentStartMinute
            currentSubject = plan[0]
            currentStartMinute = int(plan[1].split(':')[0])*60 + int(plan[1].split(':')[1])
            currentDueMinute = int(plan[2])



    return answer


solution([["korean", "11:40", "30"], ["english", "12:10", "20"], ["math", "12:30", "40"]])
