import collections


def removeDuplicateLetters(s):
    stack = [i for i in s]

    for i in s:
        if i not in stack:
            st




    return ''.join(stack)

print(removeDuplicateLetters('bcabc'))
