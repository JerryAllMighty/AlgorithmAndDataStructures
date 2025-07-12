a, b = map(int, input().rstrip().split(' '))
answer = ((a+b) * (abs(b-a)+1)) / 2
print("%d" %answer)