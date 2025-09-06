import collections

def sum123(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    return sum123(n - 1) + sum123(n - 2) + sum123(n - 3)

print(sum123(4))


