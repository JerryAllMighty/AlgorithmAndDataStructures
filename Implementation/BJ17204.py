import collections


def isRepeated(num):
    maxCnt = collections.Counter(str(num)).most_common()[0][1]
    if maxCnt > 1:
        return True
    return False


answers = []
while (True):
    try:
        n = int(input())
        if n == 0:
            break
        num = 1
        


        answers.append(num)
    except EOFError:
        break

for i in answers:
    print(i)
