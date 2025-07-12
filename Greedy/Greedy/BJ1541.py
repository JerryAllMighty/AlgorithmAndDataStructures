s = input()


def makeClac(targetString):
    if targetString.isdigit():
        return int(targetString)

    result = 0
    num = ''
    recent = ''
    for i in targetString:
        if i.isdigit():
            num += i
        else:
            if i == '+':
                result += int(num)
                num = ''
                recent = '+'
            else:
                result -= int(num)
                num = ''
                recent = '-'

    if recent == '+':
        result += int(num)
    else:
        result -= int(num)
    return result


answer = 0
# 가장 작은 수 - 가장 큰수가 정답
plus = 0
minus = 0
i = 0
num = ''
while (i < len(s) and i >=0):
    char = s[i:i + 1]

    if char.isdigit():
        num += char
        plus = int(num)

    if char == '+':
        plusIdx = s.find('+', i + 1)
        minIdx = s.find('-', i + 1)
        plus = makeClac(s[:min(plusIdx, minIdx)])
        i = min(plusIdx, minIdx)
        num = ''
    elif char == '-':
        plusIdx = s.find('+', i + 1)
        minIdx = s.find('-', i + 1)
        if minIdx == -1:
            minus = makeClac(s[i + 1:])
        else:
            minus = makeClac(s[i+1:minIdx])
        answer = plus-minus
        i = minIdx
        plus = answer
        num = ''

    i += 1

print(min(answer))
