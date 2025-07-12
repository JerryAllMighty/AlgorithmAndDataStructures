import sys
S = set()

cnt = int(sys.stdin.readline().strip())

for _ in range(cnt):
    given = sys.stdin.readline().strip().split()
    
    if given[0] == 'all':
        S = set([i for i in range(1, 21)])
        continue
    elif given[0] == 'empty':
        S = set()
        continue
    else:
        cmd, x = given[0], int(given[1])

    if cmd == 'add':
        S.add(x)
    elif cmd == 'remove':
        if x in S:
            S.discard(x)
    elif cmd == 'check':
        if x in S:
            print(1)
        else:
            print(0)
    elif cmd == 'toggle':
        if x in S:
            S.discard(x)
        else:
            S.add(x)


# list, set 사용 구분
# 저장시 str, int 사용 구분
# input 대신 readline 사용
# pypy는 시간은 적지만 메모리를 많이 소모하여 python으로 변경 