def solution(n, target):
    answer = []
    for i in range(len(n)-1):
        for j in range(i+1,len(n)):
            if n[i] + n[j] == target:
                answer.append([i,j])
    return answer


print(solution([2,7,11,15], 9))