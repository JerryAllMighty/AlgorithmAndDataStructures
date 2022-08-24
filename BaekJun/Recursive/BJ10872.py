import sys
n = sys.stdin.readline().rstrip()

answer = 1

for i in range(1, int(n)+1):
    answer = answer * i

print(answer)