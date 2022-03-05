def solution(n):
    cnt =0
    def check5(num):
        if num != 0 and num % 5 == 0:
            return True
        return False
    def check3(num):
        if num != 0 and num % 3 == 0:
            return True
        return False
    def check2(num):
        if num != 0 and num % 2 == 0:
            return True
        return False
    while True:
        a, b, c ,d = 0
        if n % 5 == 0:
            a = n / 5
        if n % 3 == 0:
            b = n /3
        if n % 2 == 0:
            c = n/2
        if n > 0:
            d = n -1

        if check5(a):
            n = a
        if check5(b):
            n = b
        if check5(c):
            n = c
        if check5(d):
            n = d
        cnt += 1
        continue



    return cnt

print(solution(26))


