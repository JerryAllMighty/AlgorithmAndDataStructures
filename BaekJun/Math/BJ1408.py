import sys

current = sys.stdin.readline().rstrip()
start = sys.stdin.readline().rstrip()


answer = ''


def validHour(hGap):
    if hGap < 0:
        hGap += 24

    return hGap


def validMinute(hGap, mGap):
    if mGap < 0:
        hGap -= 1

        hGap = validHour(hGap)

        mGap += 60

    return hGap, mGap



hGap = int(start.split(':')[0]) - int(current.split(':')[0])
hGap = validHour(hGap)


mGap = int(start.split(':')[1]) - int(current.split(':')[1])
hGap, mGap = validMinute(hGap, mGap)


sGap = int(start.split(':')[2]) - int(current.split(':')[2])
if sGap < 0:
    mGap -= 1

    hGap, mGap= validMinute(hGap, mGap)

    sGap += 60




answer += str(hGap) + ':'
answer += str(mGap) + ':'
answer += str(sGap)




def validDigitalTime(target):
    splited = target.split(':')
    h = splited[0]
    m = splited[1]
    s = splited[2]
    if len(h) == 1:
        h = '0' + h

    if len(m) == 1:
        m = '0' + m

    if len(s) == 1:
        s = '0' + s

    return h + ':' + m + ':' + s


print(validDigitalTime(answer))



