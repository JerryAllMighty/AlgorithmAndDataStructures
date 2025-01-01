n = list(input())

q = n
currentNum = 1
while(q):
    val = q.pop(0)
    if str(currentNum) == val:
        currentNum = str(int(currentNum) + 1)
        continue
    else:
        currentNum = val
        while(True):
            currentNum = str(int(currentNum) +  1)
            if val in currentNum:
                break
print(currentNum)






