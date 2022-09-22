import sys

lst = list(map(int, sys.stdin.readline().rstrip().split(' ')))

gaps = []
for i in range(2):
    gaps.append(abs(lst[i]-lst[i+1]))

print(max(gaps)-1)
    