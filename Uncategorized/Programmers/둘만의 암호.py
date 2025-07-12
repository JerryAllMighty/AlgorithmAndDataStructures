
def solution(s, skip, index):
    answer = ''
    # a = 97, z = 122, 전체 26개

    available = []

    for i in range(97, 123):
        if chr(i) not in skip:
            available.append(chr(i))

    for i in s:
        idx = available.index(i)
        answer += available[(idx+index)%len(available)]

    return answer

print(solution("aukks","wbqd",5))