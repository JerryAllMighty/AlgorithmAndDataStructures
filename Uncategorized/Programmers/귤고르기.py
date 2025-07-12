def solution(k, tangerine):
    answer = 0
    map = {}
    for i in tangerine:
        if map.get(i) is None:
            map[i] = 1
        else:
            map[i] += 1
    map = sorted(map.items(), key=lambda x: x[1], reverse=True)
    num = 0
    for i in map:
        answer += 1
        cnt = i[1]
        if num + cnt < k:
            num += cnt
        else:
            break
    return answer


print(solution(6,[1, 3, 2, 5, 4, 5, 2, 3]	))
