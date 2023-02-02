def solution(food):
    answer = '0'
    target = ''
    for i in range(1, len(food)):
        target += str(i) * (food[i]//2)
        
    answer = target + answer + target[::-1]
        
    return answer