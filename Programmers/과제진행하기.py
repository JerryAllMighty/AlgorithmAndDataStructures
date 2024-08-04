def solution(plans):
    answer = []
    unfinishedPlans = []
    currentTime = int(plans[0][1].split(':')[0]) * 60 + int(plans[0][1].split(':')[1])
    plans.sort(key=lambda x: x[1])
    idx = 0


    while (True):
        plan = plans[idx]
        subject = plan[0]
        startTime = int(plan[1].split(':')[0]) * 60 + int(plan[1].split(':')[1])
        dueTime = int(plan[2])

        if currentTime <= startTime:
            currentTime = startTime

        if idx <= len(plans) - 2:
            nextPlan = plans[idx + 1]
            nextSubject = nextPlan[0]
            nextStartTime = int(nextPlan[1].split(':')[0]) * 60 + int(nextPlan[1].split(':')[1])
            nextDueTime = int(nextPlan[2])
        else:
            if idx == len(plans) - 1 and subject not in answer:
                # 마지막 과목은 먼저 끝내기
                currentTime += dueTime
                answer.append(subject)

            # 마지막 과목을 끝낸 후 남아있던 과목을 마저 마무리
            if subject in answer and unfinishedPlans:
                while(unfinishedPlans):
                    lastUnfinishedPlan = unfinishedPlans[len(unfinishedPlans) - 1]
                    lastSubject = lastUnfinishedPlan[0]
                    lastDueTime = lastUnfinishedPlan[2]

                    currentTime += lastDueTime
                    answer.append(lastSubject)
                    unfinishedPlans.pop()

            if len(unfinishedPlans) == 0:
                break
            else:
                continue

        if nextStartTime >= currentTime + dueTime:
            currentTime += dueTime
            answer.append(subject)


            if unfinishedPlans:
                lastUnfinishedPlan = unfinishedPlans[len(unfinishedPlans) - 1]
                lastSubject = lastUnfinishedPlan[0]
                lastStartTime = lastUnfinishedPlan[1]
                lastDueTime = lastUnfinishedPlan[2]


                if nextStartTime >= currentTime + lastDueTime:
                    while (unfinishedPlans and nextStartTime >= currentTime + lastDueTime):
                        lastUnfinishedPlan = unfinishedPlans[len(unfinishedPlans) - 1]
                        lastSubject = lastUnfinishedPlan[0]
                        lastStartTime = lastUnfinishedPlan[1]
                        lastDueTime = lastUnfinishedPlan[2]

                        currentTime += lastDueTime
                        answer.append(lastSubject)
                        unfinishedPlans.pop()
                else:
                    lastDueTime -= nextStartTime - (currentTime)
                    currentTime += nextStartTime - (currentTime)
                    unfinishedPlans.pop()
                    unfinishedPlans.append([lastSubject, lastStartTime, lastDueTime])

        else:
            dueTime -= nextStartTime - (currentTime)
            currentTime += nextStartTime - (currentTime)
            unfinishedPlans.append([subject, startTime, dueTime])

        idx += 1

    return answer


print(solution(
    [["1", "00:00", "30"], ["2", "00:10", "10"], ["3", "00:30", "10"], ["4", "00:50", "10"]]
))
