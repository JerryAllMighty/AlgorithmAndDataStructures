import sys
n, m = map(int, sys.stdin.readline().split(' '))
money = []
for _ in range(n):
    one = int(sys.stdin.readline())
    money.append(one)

money.sort(reverse=True)
answer = 0
idx = 0
success = False
total = 0
while idx < len(money):
    total += m //(money[idx])
    nmg = m % (money[idx])
    if nmg == 0:
        answer = total
        success = True
        break
    else:
        idx += 1

if answer > 0:
    if success:
        print(int(total))
    else:
        print(int(answer))
else:
    print(-1)