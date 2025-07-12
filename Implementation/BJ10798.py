lst = []
maxLen = 0
answer = ''

for i in range(5):
    s = input()
    lst.append(s)
    if len(s) > maxLen:
        maxLen = len(s)


for j in range(maxLen):
    for k in range(5):
        eachString = lst[k]
        if len(eachString) > j:
            eachChar = eachString[j]
            answer += eachChar

print(answer)
