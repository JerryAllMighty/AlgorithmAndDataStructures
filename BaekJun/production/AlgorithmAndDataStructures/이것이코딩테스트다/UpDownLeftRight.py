def solution(n, s):
    # R  L D U
    jp = [(0,1),(0,-1),(1,0),(-1,0)]
    start = (1,1)
    jps = s.split(' ')
    def isValid(tp, jp, n):
        expected = (tp[0] + jp[0], tp[1] + jp[1])
        if  expected[0] < 1 or expected[0] > n:
            return False
        elif expected[1] < 1 or expected[1] > n:
            return False
        return True

    for i in jps:
        if i == 'R':
            if isValid(start, jp[0], n):
                start = (start[0] + jp[0][0], start[1] + jp[0][1])
                print(start)
        elif i == 'L':
            if isValid(start, jp[1], n):
                start = (start[0] + jp[1][0], start[1] + jp[1][1])
                print(start)
        elif i == 'D':
            if isValid(start, jp[2], n):
                start = (start[0] + jp[2][0], start[1] + jp[2][1])
                print(start)
        elif i == 'U':
            if isValid(start, jp[3], n):
                start = (start[0] + jp[3][0], start[1] + jp[3][1])
                print(start)

    return start

print(solution(5, 'R R R U D D'))

