n = int(input())
# 자기보다 키가 큰 사람의 수
tallerLst = list(map(int, input().split()))
lst = [i for i in range(1, n + 1)]
answer = [i for i in range(1, n + 1)]

# 해당 인덱스 해당 숫자까지 키가 큰 사람이 몇명인지
def cntTallerPeople(n, idx):
    result = 0
    for i in range(idx + 1):
        if answer[i] > n:
            result += 1
    return result

for i in range(len(lst)-1,-1,-1):
    val = lst[i]
    # 자기보다 키가 큰 사람의 수
    tallerCnt = tallerLst[i]
    cnt = cntTallerPeople(val, i)
    if cnt != tallerCnt:
    # 자기보다 키가 큰 사람이 몇명인지 카운트하여 재배열
        for j in range(len(answer)):
            eachCnt = cntTallerPeople(val, j)
            if eachCnt == tallerCnt:
                # 재배열
                answer[i], answer[j] = answer[j], answer[i]
                break

print(*answer)
