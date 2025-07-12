def isSurprising(s):
    days = True
    d = 0
    while d <= len(s) - 2:
        left = 0
        temp = []
        while left + d + 2 <= len(s):
            leftPair = s[left:left + 1]
            rightPair = s[left + 1 + d:left + 2 + d]
            if (leftPair, rightPair) in temp:
                return False
            else:
                temp.append((leftPair, rightPair))
            left += 1
        d += 1

    return days


while True:
    try:
        s = input()
        answer = isSurprising(s)
        if s == '*':
            exit(0)
        if answer is True:
            print(s + ' is surprising.')
        else:
            print(s + ' is NOT surprising.')
    except EOFError:
        exit(1)
