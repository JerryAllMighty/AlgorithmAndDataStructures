s = input()
size = len(s)
answer = ['0' for i in range(size)]

sLst = list(s)
sLst.sort()

leftIdx = 0
rightIdx = size - 1

wordsLeft = []

while (sLst):
    word = sLst.pop(0)
    cnt = sLst.count(word)
    if cnt > 0:
        answer[leftIdx] = word
        leftIdx += 1
        answer[rightIdx] = word
        rightIdx -= 1
        sLst.remove(word)
    else:
        wordsLeft.append(word)

while(wordsLeft):
    val = wordsLeft.pop(0)
    for k in range(len(answer)):
        if answer[k] == '0':
            answer[k] = val
            break

answer = ''.join(answer)
if answer == answer[::-1]:
    print(answer)
else:
    print('I\'m Sorry Hansoo')
