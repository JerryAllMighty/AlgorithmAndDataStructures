import sys

total, target = list(map(int, sys.stdin.readline().rstrip().split(' ')))
numLists = list(map(int, sys.stdin.readline().rstrip().split(' ')))


numLists.sort()

first, second, third = total - 3, total - 2, total - 1
best = numLists[first] + numLists[second] + numLists[third]


while True:
    to_be = numLists[first] + numLists[second] + numLists[third]

    if abs(target - best) > abs(target - to_be) and to_be < target:
        best = to_be

    if to_be == target:
        best = to_be
        break

    if first != 0:
        first -= 1
    else:
        if second == 1:
            if third == 2:
                if best > target:
                    best = to_be
                break
            else:
                third -= 1
                second  = third - 1
                first = second - 1
        else:
            second -= 1
            first = second - 1



print(best)
