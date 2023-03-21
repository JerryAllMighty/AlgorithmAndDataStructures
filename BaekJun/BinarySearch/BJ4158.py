import sys
from collections import defaultdict
answers = []
while True:
    try:
        n, m = map(int, sys.stdin.readline().rstrip().split(' '))

        if n == 0 and m == 0:
            break

        nList= defaultdict(bool)

        answer = 0

        for _ in range(n):
            num = int(sys.stdin.readline().rstrip())
            nList[num] = True

        for _ in range(m):
            num = int(sys.stdin.readline().rstrip())
            if nList[num]:
                answer += 1

        answers.append(answer)

    except EOFError:
        break

for i in answers:
    print(i)



