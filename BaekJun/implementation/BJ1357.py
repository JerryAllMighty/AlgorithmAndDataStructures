import sys

x, y = list(map(int, sys.stdin.readline().rstrip().split(' ')))



def Solution(x, y):
    revX = Rev(x)
    revY = Rev(y)
    answer = revX + revY
    return Rev(answer)

def Rev(num):
    strNum = [o for o in str(num)]
    answer = ''
    while strNum:
        last = strNum.pop()
        answer  += last

    return int(answer)


print(Solution(x, y))