import sys
import collections
cnt = int(sys.stdin.readline())

stack = []
v = {')':'('}
stack2 = []
for _ in range(cnt):
    stack.append(sys.stdin.readline().strip())


while stack:
    one = stack.pop()
    t = collections.deque(one)
    while t:
        two = t[0]
        if not v.get(two):
            stack2.append(two)
            t.popleft()
        else:
            if stack2:
                stack2.pop()
                t.popleft()

    print(len(stack2) == 0 and len(t) == 0)
