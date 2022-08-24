import sys

totalCnt = sys.stdin.readline().rstrip()

answers = []

for _ in range(int(totalCnt)):
    eachNum = sys.stdin.readline().rstrip()
    if int(eachNum) <= 1000 or int(eachNum) >= -1000:
        if eachNum not in answers:
            answers.append(int(eachNum))

answers.sort()    
[print(i) for i in answers]


# readline() 과 input의 차이.

# 각각 메모리, 시간의 차이
# 30840 KB, 84ms/ 30840KB, 112ms
# 시간은 readline()이 더 우세.