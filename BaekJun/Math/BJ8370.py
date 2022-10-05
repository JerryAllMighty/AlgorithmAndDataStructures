import sys

n1, k1, n2, k2 = map(int, sys.stdin.readline().rstrip().split(' '))

print(n1 * k1 + n2 * k2)