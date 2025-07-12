import collections


class Node:
    def __init__(self, val, next):
        self.val = val
        self.next = next

class MyStack:

    def __init__(self):
        self.queue = collections.deque()

    def push(self, val):
        self.queue.append(val)

    def pop(self):
        return self.queue.pop()

    def top(self):
        return self.q[len(self.q)-1]

    def empty(self):
        return len(self.queue) == 0

class Solution:
    def QueueTest():
        mystack = MyStack()
        mystack.push('1')
        return mystack.queue

    print(QueueTest())