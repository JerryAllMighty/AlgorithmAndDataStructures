def solution(n):
    cnt  = 0
    #n시까지 3일 들어간 모든 경우의 수
    for i in range(n+1):
        for j in range(60):
            for k in range(60):
                if '3' in str(i)+ str(j) + str(k):
                    cnt += 1
    return cnt

print(solution(5))

