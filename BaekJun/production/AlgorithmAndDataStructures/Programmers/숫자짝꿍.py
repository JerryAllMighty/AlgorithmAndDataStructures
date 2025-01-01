#This is for those who need some python file to practice.
#이 공간은 파이썬 연습 공간입니다.

# 기존의 풀이, 시간초과가 나옴
# def solution(X, Y):
#     answer = ''
#     jk = []
#     pairedIdx = []
#     zeroFlag = False
#     for i in range(len(X)):
#         xValue = X[i]
#         for j in range(len(Y)):
#             yValue = Y[j]
#             if xValue == yValue and j not in pairedIdx:
#
#                 # X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0
#                 if xValue != '0':
#                     zeroFlag = True
#
#                 jk.append(xValue)
#                 pairedIdx.append(j)
#                 break
#
#     # X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 - 1
#     if len(jk) == 0:
#         return '-1'
#     else:
#         if zeroFlag:
#             jk.sort(reverse=True)
#             for i in jk:
#                 answer += i
#             return answer
#         else:
#             return '0'


def solution(X, Y):
    answer = ''

    for i in range(9, -1, -1):
        answer += str(i) * min(X.count(str(i)), Y.count(str(i)))

    if len(answer) == 0:
        return '-1'
    if answer.count('0') == len(answer):
        return '0'
    else:
        return answer

print(solution("5525","1255"))