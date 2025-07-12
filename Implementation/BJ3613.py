s = list(input())


def isCPlusPlus(targetStringList):
    days = True
    for i in range(len(targetStringList)):
        if targetStringList[i].isupper() is True:
            return False
        if i < len(targetStringList) - 1:
            if targetStringList[i] == '_' and targetStringList[i+1] == '_':
                return False
            if i == 0 and targetStringList[i] == '_':
                return False
        else:
            if targetStringList[i] == '_':
                return False

    return days


def isJava(targetStringList):
    days = True
    if targetStringList[0].isupper() is True or targetStringList[0] == '_':
        return False

    for i in range(1, len(targetStringList)):
        if targetStringList[i] == '_':
            return False

    return days


java = isJava(s)
cPlusPlus = isCPlusPlus(s)

if java is False and cPlusPlus is False:
    print('Error!')
    exit(0)

answer = ''
skip = False

# Java의 경우
if java is True:
    for i in range(len(s)):
        c = s[i]
        if c.isupper() is True:
            answer += '_'
            answer += c.lower()
        else:
            answer += c

elif cPlusPlus is True:
    for i in range(len(s)):
        c = s[i]
        if skip is True:
            answer += c.upper()
            skip = False
            continue
        if c == '_':
            skip = True
        else:
            answer += c

print(answer)
