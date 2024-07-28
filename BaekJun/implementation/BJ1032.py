n = int(input(''))

lst = []
for i in range(n):
    s = input()
    lst.append(s)

duplicateString = ''
for i in range(len(lst[0])):
    eachChar = lst[0][i]
    isSame = True
    for k in range(1, n):
        val = lst[k][i]
        if eachChar != lst[k][i]:
            isSame = False

    if isSame:
        duplicateString += eachChar
    else:
        duplicateString += '?'

print(duplicateString)

