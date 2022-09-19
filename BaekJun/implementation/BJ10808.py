import sys

S = sys.stdin.readline().rstrip()

cmp = [0 for _ in range(26)]

for i in S:
    idx = ord(i) - 97
    cmp[idx] += 1

answer = " ".join([str(i) for i in cmp])
print(answer)