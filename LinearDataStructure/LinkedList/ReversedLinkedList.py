# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        for i in range(len(head) - 1):
            for p in range(i + 1, len(head)):
                head[i], head[p] = head[p], head[i]

        return head

    print(reverseList([1, 2, 3, 4, 5]))

