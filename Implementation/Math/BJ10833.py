import sys

schoolCnt = int(sys.stdin.readline().rstrip())

answer = 0
for _ in range(schoolCnt):
    studentCnt, appleCnt = list(map(int, sys.stdin.readline().rstrip().split(' ')))
    answer += appleCnt - ((appleCnt // studentCnt) * studentCnt)


print(answer)