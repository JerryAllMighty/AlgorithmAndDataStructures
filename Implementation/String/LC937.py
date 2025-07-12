def reorderLogFiles(logs):
    letlogs = []
    diglogs = []
    for i in range(len(logs)):
        identifier = logs[i].split(' ')[1]
        if identifier.isdigit():
            diglogs.append(logs[i])
        else:
            letlogs.append(logs[i])

    letlogs.sort(key=lambda x:(x.split(' ')[1:],x.split(' ')[0]))
    return letlogs + diglogs

print(reorderLogFiles(["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]))


