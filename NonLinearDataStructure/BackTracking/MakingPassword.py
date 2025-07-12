import random


def MakePassword(L, C, cArray):
    # 서로 다른 L개의 알파베 소문자
    # 최소 한개 모음, 최소 2개 자음
    # 정렬
    # 문자의 종류는 C

    M = []
    J = []
    answer= []
    possibleAns = ''
    for i in cArray:
        if i == "a" or i == "e" or i == "i" or i == "o" or i == "u":
            M.append(i)
        else:
            J.append(i)

    randomMidx = random.randrange(0, len(M))
    possibleAns += M[randomMidx]
    randomJidx = random.randrange(0, len(J))
    possibleAns += J[randomJidx]
    while True:
        randomJ2idx = random.randrange(0, len(M))
        if J[randomJ2idx] not in possibleAns:
            break

    possibleAns = M[randomMidx] + J[randomJidx] + J[randomJ2idx]
    while len(possibleAns) < L:
        randIdx = random.randrange(0,6)
        if cArray[randIdx] in possibleAns:
            continue
        possibleAns += cArray[randIdx]


    stringToArray = [i for i in possibleAns]
    stringToArray.sort()
    return "".join(stringToArray)


print(MakePassword(4,6, ['a','t','c','i','s','w']))