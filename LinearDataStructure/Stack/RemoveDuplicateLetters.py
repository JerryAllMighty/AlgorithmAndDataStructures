def RemoveDuplicateLetters(s):
    answer = ''
    for i in s:
        if i not in answer:
            answer += i
    answer.sort()
    return answer

print(RemoveDuplicateLetters("aaabbcccddd"))