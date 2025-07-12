import sys
a, b = sys.stdin.readline().rstrip().split()
print(max(int(''.join(list(reversed(a)))), int(''.join(list(reversed(b))))))

