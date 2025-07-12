
total = int(input())

eachNum = list(map(int, input().split(' ')))

target  = int(input())

cnt = eachNum.count(target)

print(cnt)
