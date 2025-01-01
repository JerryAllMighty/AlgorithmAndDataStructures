import sys
n, k = sys.stdin.readline().split(' ')
a = sys.stdin.readline().split(' ')
b = sys.stdin.readline().split(' ')

for _ in range(int(k)):
    small = a.index(min(a))
    big = b.index(max(b))
    a[small], b[big] = b[big], a[small]

print(sum([int(i) for i in a]))
