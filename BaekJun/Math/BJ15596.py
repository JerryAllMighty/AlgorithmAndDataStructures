import sys
# def solve(a: list) -> int:
#   return sum(a)

#2024.07.03
#Another solve
class Stack:
    global stack
    def __init__(self):
        stack = []

    def size(self):
        count = 0
        for i in stack:
            count += i
        return count


    def push(self, num):
        idx = stack.size()
        stack[idx-1] = num

    def empty(self):
        if stack.size() == 0:
            return 1
        else:
            return 0


    def pop(self):
        #스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if stack.size() == 0:
            return -1
        else:
            return Stack.top(self)

    def top(self):
        if stack.size() == 0:
            return -1
        else:
            return stack[-1]





stack = Stack()

cnt = int(sys.stdin.readline())
for i in range(cnt):
    cmd = sys.stdin.readline()
    if cmd.split(' ')[0] == 'push':
        stack.push(cmd.split(' ')[1])
    elif cmd == 'top':
        print(stack.top())
    elif cmd == 'empty':
        print(stack.empty())
    elif cmd == 'size':
        print(stack.size())
    elif cmd == 'pop':
        print(stack.pop())




