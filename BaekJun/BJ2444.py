n = int(input())

def recursive2(num):
    if num == 0:
        return
    recursive2(num - 1)
    if num != n:
        print(' ' * (n - num) + '*' * (2 * (num) - 1))

def recursive(num):
    if num == 0:
        return
    print(' ' * (n-num) + '*' * (2 *(num) - 1))
    recursive(num - 1)

recursive2(n)
recursive(n)
