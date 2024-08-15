s = input()
if '<' not in s:
    lst = s.split(' ')
    for i in lst:
        print(i[::-1], end=' ')
else:
    answer = ''
    isTag = False
    flipWord = ''
    for i in range(len(s)):
        word = s[i:i+1]
        # 태그면 정답에 바로 삽입
        if word == '<':
            isTag = True
            #태그와 태그 사이의 단어는 뒤집어서 삽입
            if flipWord != '':
                lst = flipWord.split(' ')
                for i in lst:
                    answer += i[::-1] + ' '
                answer = answer[:-1]
                flipWord = ''
            answer += word
        elif word == '>':
            isTag = False
            answer += word
        else:
            if isTag is True: #태그인 경우 단어 그대로 삽입
                answer += word
            else:   #태그가 아니라면 뒤집어서 삽입할 단어로 정의
                flipWord += word

    # 잔여 단어 리스트 넣어주기
    if flipWord != '':
        lst = flipWord.split(' ')
        for i in lst:
            answer += i[::-1] + ' '
        answer = answer[:-1]
    print(answer)





