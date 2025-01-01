class ListNode:
    def __init__(self, val, next=None):
        self.val = val
        self.next = next

def merge(self, l1:ListNode,l2:ListNode):
    sortedNumList = []

    while l1:
        sortedNumList.append(l1.val)
        l1 = l1.next

    while l2 :
        sortedNumList.append(l2.val)
        l2 = l2.next

    sortedNumList.sort()
    answer = ListNode(sortedNumList[0])

    for i in range(1, len(sortedNumList)-1):
        answer = answer.next
        val, next = sortedNumList[i], ListNode(sortedNumList[i+1])
        answer.val = val
        answer.next = next

    return sortedNumList


