import sys
n, m = map(int, sys.stdin.readline().rstrip().split(' '))
lst = list(map(int, sys.stdin.readline().rstrip().split(' ')))
available = []
for j in lst:
    multiple = 1
    while True:
        num = multiple * j
        if num <= n:
            if num not in available:
                available.append(num)
            multiple += 1
        else:
            break

print(sum(available))