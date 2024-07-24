# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def insertionSortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cmp = head.val
        next = head.next.val

        # find the index to insert
        while(True):
            if cmp > next:
                head.val = next
                head.next.val =


