# 1231 의 순서인 경우메만 햄버거가 완성
def solution(ingredient):
    answer = 0
    currentString = ''
    for i in ingredient:
        currentString += str(i)
        if len(currentString) >= 4 and currentString[-4:] == '1231':
            answer += 1
            currentString = currentString[:-4]
    return answer

print(solution(   	[2, 1, 1, 2, 3, 1, 2, 3, 1]))