def solution(n):
    cnt = 0
    move = [[-1,2], [1,2],[-1,-2],[1,-2],[-2,1],[-2,-1],[2,1],[2,-1]]
    def isValid(jp, move):
        expected = [jp[0]+move[0], jp[1]+move[1]]
        if expected[0] < 1 or expected[0] > 8:
            return False
        elif expected[1] < 1 or expected[1] > 8:
            return False
        return True

    for i in range(len(move)):
        if isValid(n,move[i]):
            cnt +=1

    return cnt

print(solution([1,1]))