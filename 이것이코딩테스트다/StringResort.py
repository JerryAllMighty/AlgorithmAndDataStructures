def solution(s):
    num = []
    alpha = []
    answer = ''
    for i in s:
        if i.isnumeric():
            num.append(int(i))
        else:
            alpha.append(i)

    alpha.sort()
    print(alpha)
    answer += "".join(alpha)
    answer += str(sum(num))
    return answer

print(solution('AJKDLSI412K4JSJ9D'))