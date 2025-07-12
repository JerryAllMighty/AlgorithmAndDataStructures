import sys
num = sys.stdin.readline().rstrip().replace(' ', '')


# 시계수 만드는 함수
def makeSigyeSu(targetString):
    available = []

    for i in range(4):
        lastIdx = (i % 4)
        available.append(targetString[i:] + targetString[:lastIdx])

    return min(available)


# 타겟이 되는 시계수
sigyesu = makeSigyeSu(num)

# 답, 인덱스
answer = 0

# 모든 시계열을 담는 리스트
sigyesuLst = []
# 모든 시계수 담아주기
for i in range(1111, 10000):
    i = str(i)
    # 문제의 조건은 자연수
    if '0' in i:
        i = i.replace('0', '1')
    eachSigyesu = makeSigyeSu(i)
    if eachSigyesu not in sigyesuLst:
        sigyesuLst.append(eachSigyesu)
# if eachSigyesu == sigyesu:
#     print(answer)
#     break
# else:
#     answer += 1

# 작은 순서를 찾아야하므로 정렬
# sigyesuLst.sort()


print(sigyesuLst.index(sigyesu) + 1)
