s = input()

cnt = len(s)//10
startIdx = 0
finalIdx = 10

while(cnt >= 0):
    print(s[startIdx:finalIdx])
    cnt -= 1
    startIdx += 10
    finalIdx += 10
