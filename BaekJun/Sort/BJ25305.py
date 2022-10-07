import sys
total, awardCnt = sys.stdin.readline().rstrip().split(' ')

scores = list(map(int, sys.stdin.readline().rstrip().split(' ')))

scores.sort(reverse=True)

print(scores[int(awardCnt)-1])

