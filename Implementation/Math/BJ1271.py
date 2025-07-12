import sys
current, cnt = list(map(int, sys.stdin.readline().rstrip().split(' ')))

eachOne = current // cnt
moneyLeft = current - (eachOne * cnt)

print(eachOne)
print(moneyLeft)
