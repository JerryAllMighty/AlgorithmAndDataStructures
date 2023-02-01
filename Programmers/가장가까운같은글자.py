def solution(s):
    answer = []
    for idx in range(len(s)):
        if s[:idx+1].count(s[idx]) == 1:
            answer.append(-1)
        else:
            answer.append(idx - s[:idx].rindex(s[idx]))
        
    return answer