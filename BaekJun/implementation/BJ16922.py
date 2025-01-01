cnt = int(input())

lst = set()
strLst = ['I', 'V', 'X', 'L']


def changeToNum(char):
    if char == 'I':
        return 1
    elif char == 'V':
        return 5
    elif char == 'X':
        return 10
    elif char == 'L':
        return 50
    return


def recursive(n, num,k):
    days = num
    if n == 0:
        return num
    for i in strLst:
        days = recursive(n - 1, num + changeToNum(i),k+1)
        if k == cnt:
            lst.add(days)
            days = num
    return days


# for i in strLst:
#     for j in strLst:
#         lst.add(changeToNum(i) + changeToNum(j))

recursive(cnt,0,1)
print(len(lst))
