# 매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수
def solution(k, score):
    answer = []
    honors = []
    for i in score:
        #명예의 전당은 k번째까지만 올리고 기존의 k 번째 순위가 내려온다
        if len(honors) >= k:
            remove = min(honors)
            if i > remove:
                honors.remove(remove)
                honors.append(i)
        else:
            honors.append(i)
        #최하위를 발표한다
        answer.append(min(honors))

    return answer

solution(3, [10, 100, 20, 150, 1, 100, 200])