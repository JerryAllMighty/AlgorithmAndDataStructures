import sys
cnt = int(sys.stdin.readline().rstrip())

distances = []

for _ in range(cnt):
    a, b = sys.stdin.readline().rstrip().split(' ')
    distance = ''
    for i in range(len(a)):
        gap = ord(a[i]) - ord(b[i])
        if gap <= 0:
            distance += str(abs(gap)) + ' '
        else:
            distance += str(26 - abs(gap)) + ' '


    distances.append('Distances:' + ' ' + distance[:len(distance)])
    

for j in distances:
    print(j)