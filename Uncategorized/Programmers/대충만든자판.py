
# 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보는 함수
def solution(keymap, targets):
    answer = []
    alphabetIndex = {}
    for i in range(len(keymap)):
        for j in range(len(keymap[i])):
            eachString = keymap[i][j]
            if eachString not in alphabetIndex:
                alphabetIndex[eachString] = j
            else:
                #더 적은 인덱스를 구해서 값을 대체한다
                val = alphabetIndex[eachString]
                cmp = j
                if cmp < val:
                    alphabetIndex[eachString] = cmp

    for s in targets:
        # 각각의 키맵에서 특정 문자를 출력하는데 필요한 횟수
        cnt = 0
        for ss in s:
            # 그중 최솟값
            targetString = alphabetIndex.get(ss, -1)
            if targetString == -1:
                cnt = -1
                break
            else:
                cnt += targetString + 1
        answer.append(cnt)
    return answer

print(solution(["ABACD", "BCEFD"],["ABCD","AABB"]))