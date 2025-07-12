def solution(ingredient):
    answer = 0
    used = []
    for i in range(len(ingredient)-3):
        if ingredient[i] ==1 and ingredient[i+1] ==2 and ingredient[i+2] ==3 and ingredient[i+3] ==1 and ingredient[i] not in used:
             
                
            
    return answer

print(solution([1, 3, 2, 1, 2, 1, 3, 1, 2]))