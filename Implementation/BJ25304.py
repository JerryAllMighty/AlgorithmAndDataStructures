import sys

total = sys.stdin.readline().rstrip()
kinds = sys.stdin.readline().rstrip()

untilNow = 0
for _ in range(int(kinds)):
    price, cnt = list(map(int, sys.stdin.readline().rstrip().split(' ')))
    untilNow += price * cnt

if untilNow == int(total):
    print('Yes')
else:
    print('No')