import collections


def isValid(s):
    count1 = collections.Counter(s).get('(')
    count2 = collections.Counter(s).get(')')
    if count1 != count2:
        return False
    if s[0:1] == ')':
        return False

    return True

def solution(s):
    stack = []
    if isValid(s) is False:
        return False

    for i in s:
        if i == '(':
            stack.append(i)
        else:
            if stack:
                stack.pop()

    if stack:
        return False
    else:
        return True


print('true' if solution("(()(") else 'false')