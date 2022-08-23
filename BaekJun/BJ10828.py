import sys


total =sys.stdin.readline().rstrip()


class Stack():

    st = []
    def __init__(self):
        self.st = []

    def push(self, number):
        self.st.append(number)

    def pop(self):
        lastValue = self.top()
        if lastValue != -1:
            lastValueBeforeRemoval =  self.st[len(self.st)-1]
            del self.st[len(self.st)-1]
            return lastValueBeforeRemoval
        else:
            return lastValue
            
    def size(self):
        return len(self.st)

    def empty(self):
        if len(self.st) == 0:
            return 1
        else:
            return 0


    def top(self):
        length = len(self.st)
        if length > 0:
            return int(self.st[length-1])
        else:
            return -1


st = Stack()

for _ in range(int(total)):    
    eachCommand = sys.stdin.readline().rstrip().split(' ')
    for i in eachCommand:
        if i == "push":
            st.push(eachCommand[1])
        elif i == "pop":
            print(st.pop())
        elif i == "top":
            print(st.top())
        elif i == "size":
            print(st.size())
        elif i == "empty":
            print(st.empty())

