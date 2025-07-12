import sys

cmp = [i for i in range(1, 31)]

for _ in range(28):
    eachOne = int(sys.stdin.readline().rstrip())
    cmp.remove(eachOne)

for j in cmp:
    print(j)
