# 119688	312 pypy
# 31248	108 python3
n, m = map(int, input().split())

lst = [
    [i for i in input()]
    for _ in range(n)
]
available1 = ['I', 'E']
available2 = ['S', 'N']
available3 = ['T', 'F']
available4 = ['P', 'J']


def checkValidation(row, col, direction, option, option2):
    if direction == 'v':
        if option == 'u':
            if (row - 3) < 0 or (row - 3) >= n:
                return False
            if (row - 2) < 0 or (row - 2) >= n:
                return False
            if (row - 1) < 0 or (row - 1) >= n:
                return False
            if (row) < 0 or (row) >= n:
                return False
        elif option == 'd':
            if (row) < 0 or (row) >= n:
                return False
            if (row + 1) < 0 or (row + 1) >= n:
                return False
            if (row + 2) < 0 or (row + 2) >= n:
                return False
            if (row + 3) < 0 or (row + 3) >= n:
                return False

        if (col) < 0 or (col) >= m:
            return False

    elif direction == 'h':
        if option == 'r':
            if (col) < 0 or (col) >= m:
                return False
            if (col + 1) < 0 or (col + 1) >= m:
                return False
            if (col + 2) < 0 or (col + 2) >= m:
                return False
            if (col + 3) < 0 or (col + 3) >= m:
                return False
        elif option == 'l':
            if (col) < 0 or (col) >= m:
                return False
            if (col - 1) < 0 or (col - 1) >= m:
                return False
            if (col - 2) < 0 or (col - 2) >= m:
                return False
            if (col - 3) < 0 or (col - 3) >= m:
                return False

        if (row) < 0 or (row) >= n:
            return False

    elif direction == 'd':
        if option == 'u':
            if (row) < 0 or (row) >= n:
                return False
            if (row - 1) < 0 or (row - 1) >= n:
                return False
            if (row - 2) < 0 or (row - 2) >= n:
                return False
            if (row - 3) < 0 or (row - 3) >= n:
                return False

            if option2 == 'r':
                if (col) < 0 or (col) >= m:
                    return False
                if (col + 1) < 0 or (col + 1) >= m:
                    return False
                if (col + 2) < 0 or (col + 2) >= m:
                    return False
                if (col + 3) < 0 or (col + 3) >= m:
                    return False
            elif option2 == 'l':
                if (col) < 0 or (col) >= m:
                    return False
                if (col - 1) < 0 or (col - 1) >= m:
                    return False
                if (col - 2) < 0 or (col - 2) >= m:
                    return False
                if (col - 3) < 0 or (col - 3) >= m:
                    return False
        elif option == 'd':
            if (row) < 0 or (row) >= n:
                return False
            if (row + 1) < 0 or (row + 1) >= n:
                return False
            if (row + 2) < 0 or (row + 2) >= n:
                return False
            if (row + 3) < 0 or (row + 3) >= n:
                return False

            if option2 == 'r':
                if (col) < 0 or (col) >= m:
                    return False
                if (col + 1) < 0 or (col + 1) >= m:
                    return False
                if (col + 2) < 0 or (col + 2) >= m:
                    return False
                if (col + 3) < 0 or (col + 3) >= m:
                    return False
            elif option2 == 'l':
                if (col) < 0 or (col) >= m:
                    return False
                if (col - 1) < 0 or (col - 1) >= m:
                    return False
                if (col - 2) < 0 or (col - 2) >= m:
                    return False
                if (col - 3) < 0 or (col - 3) >= m:
                    return False

    return True


def isMBTI(targetString):
    if (targetString[:1] in available1) and (targetString[1:2] in available2) and (
            targetString[2:3] in available3) and (targetString[3:4] in available4):
        return True
    return False


def search(row, col):
    result = 0
    # horizontal, vertical, or diagonal direction check

    if checkValidation(row, col, 'v', 'u', None):
        targetString1 = lst[row][col] + lst[row - 1][col]+  lst[row - 2][col] + lst[row - 3][col]
        if isMBTI(targetString1):
            result += 1

    if checkValidation(row, col, 'v', 'd', None):
        targetString2 = lst[row][col] + lst[row + 1][col] + lst[row + 2][col] + lst[row + 3][col]
        if isMBTI(targetString2):
            result += 1

    if checkValidation(row, col, 'h', 'r', None):
        targetString3 = lst[row][col] + lst[row][col + 1] + lst[row][col + 2] + lst[row][col + 3]
        if isMBTI(targetString3):
            result += 1

    if checkValidation(row, col, 'h', 'l', None):
        targetString4 = lst[row][col] + lst[row][col - 1] + lst[row][col - 2] + lst[row][col - 3]
        if isMBTI(targetString4):
            result += 1

    if checkValidation(row, col, 'd', 'u', 'r'):
        targetString5 = lst[row][col] + lst[row - 1][col + 1] + lst[row - 2][col + 2] + lst[row - 3][col + 3]
        if isMBTI(targetString5):
            result += 1

    if checkValidation(row, col, 'd', 'u', 'l'):
        targetString6 = lst[row][col] + lst[row - 1][col - 1] + lst[row - 2][col - 2] + lst[row - 3][col - 3]
        if isMBTI(targetString6):
            result += 1

    if checkValidation(row, col, 'd', 'd', 'l'):
        targetString7 = lst[row][col] + lst[row + 1][col - 1] + lst[row + 2][col - 2] + lst[row + 3][col - 3]
        if isMBTI(targetString7):
            result += 1

    if checkValidation(row, col, 'd', 'd', 'r'):
        targetString8 = lst[row][col] + lst[row + 1][col + 1] + lst[row + 2][col + 2] + lst[row + 3][col + 3]
        if isMBTI(targetString8):
            result += 1

    return result


answer = 0
for i in range(n):
    for j in range(m):
        val = lst[i][j]
        if val in available1:
            answer += search(i, j)

print(answer)
