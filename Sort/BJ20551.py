import math

n, m = map(int, input().split())
lst = []
for _ in range(n):
    each = int(input())
    lst.append(each)

lst.sort()


def findIdx(targetNum):
    left = 0
    right = n - 1
    result = -1
    mid = (left + right) // 2
    while (right > 0 and left < n ):
        if lst[mid] == targetNum:
            result = mid
            break
        elif lst[mid] < targetNum:
            left = mid + 1
            mid = (left + right) // 2
        elif lst[mid] > targetNum:
            right = mid
            mid = (left + right) // 2

    return result


answers = []
for _ in range(m):
    question = int(input())
    idx = findIdx(question)
    answers.append(idx)

for i in answers:
    print(i)
