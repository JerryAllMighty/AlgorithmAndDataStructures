cnt = int(input())
winningTeamAndTimeAndScore = []
answer = [[0], [0]]


def whoWinsWithScore():
    score1 = 0
    score2 = 0
    for i in winningTeamAndTimeAndScore:
        if i[0] == 1:
            score1 += 1
        else:
            score2 += 1
    if score1 > score2:
        return 1, score1
    else:
        return 2, score2


winningTeam = 0
winningTime = 0
winningScore = 0
for i in range(cnt):
    team, time = input().split()
    time = (int(time.split(':')[0]) * 60) + int(time.split(':')[1])
    winningTeamAndTimeAndScore.append([int(team), time, 1])

    if i == 0:
        winningTeam = int(team)
        winningTime = time
        winningScore = 1
        continue

    # 매번 누가 이기고 있는지 체크
    nowWin, nowWinScore = whoWinsWithScore()
    # 이기는 팀이 바뀌게 되었다면 전 팀이 이기기 시작한 시간 - 이번 팀이 시작한 시간
    if winningTeam != nowWin:
        winningTeam = int(team)
        winningTime = time
        winningScore = nowWinScore
        if winningTeam == 1:
            answer[0][0] += time - winningTime
        else:
            answer[1][0] += time - winningTime

# 모두 끝나고 나서 이기고 있었던 팀의 시간에 48- 이기기 시작한 시간 더해주기
if winningTeam == 1:
    answer[0][0] += (48 * 60) - winningTime
else:
    answer[1][0] += (48 * 60) - winningTime
for i in answer:
    minute = (i[0] // 60)
    if minute < 10:
        minute = '0' + str(minute)
    else:
        minute = str(minute)
    second = (i[0] % 60)
    if second < 10:
        second = '0' + str(second)
    else:
        second = str(second)
    print(minute + ':' + second)
