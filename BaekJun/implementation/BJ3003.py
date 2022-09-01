import sys

king, queen, luke, bishop, knight, pone = list(map(int, sys.stdin.readline().rstrip().split(' ')))

#필요한 개수, 순서대로 : 1,1,2,2,2,8

answer = ''
answer += str(1-king) + ' '
answer += str(1-queen)+ ' '
answer += str(2-luke)+ ' '
answer += str(2-bishop)+ ' '
answer += str(2-knight)+ ' '
answer += str(8-pone)

print(answer)