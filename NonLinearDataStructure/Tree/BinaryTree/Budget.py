import sys

cnt = int(sys.stdin.readline())
request = list(map(int, sys.stdin.readline().split()))
total = int(sys.stdin.readline())
answer = 0
up = max(request)
down = 0
answer = (up + down) // 2
if sum(request) < total:
    answer = max(request)
    print(answer)
else:

    while down <= up:
        plus = 0

        for i in request:
            if i > answer:
               plus += answer
            else:
                plus += i
        #상한액을 올리기
        if  plus < total:
            down = answer + 1
            # if up-down < 2:
            #     break
        # 상한액을 내리기
        else:
            up = answer -1
        answer = (up + down) // 2
    print(answer)