
def solution(s, skip, index):
    answer = ''
    # a = 97, z = 122, 전체 26개
    for i in s:
        targetIndex = index
        for j in range(1, index+1):
            temp = chr(ord(i)+j)
            if temp in skip:
                targetIndex += 1

        if ord(i)+ targetIndex > 122:
            answer += chr(96 + (ord(i)+ targetIndex - 122))
        else:
            answer += chr(ord(i)+targetIndex)

    return answer

print(solution("aukks","wbqd",5))