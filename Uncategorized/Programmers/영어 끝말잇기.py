def solution(n, words):
    answers = [0,0]
    visited = []
    cnt = 1
    idx = 0
    lastChar = words[0][0:1]
    while (words):
        idx += 1
        val = words.pop(0)
        if val in visited or val[0:1] != lastChar:
            answers[0] = idx
            answers[1] = cnt
            break
        elif val not in visited:
            visited.append(val)
            lastChar = val[-1]

        if idx % n == 0:
            cnt += 1
            idx = 0
    return answers


# print(solution(2,	["hello", "one", "even", "never", "now", "world", "draw"]))
