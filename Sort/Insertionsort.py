import collections


def solution(lst):
    # answer = []
    # q = collections.deque()
    # for i in range(len(lst)):
    #     #뽑아서 하나 넣고,
    #     new = lst[i]
    #     answer.append(new)
    #     # 뒤에서부터 앞으오 정렬
    #     for o in reversed(range(1,len(answer))):
    #         if answer[o-1] > answer[o]:
    #             answer[o-1], answer[o] = answer[o], answer[o-1]
    #
    #
    # return answer
# 2
#     def insertionSortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#
#         def recursive(node: ListNode, new):
#             # 마지막에 값을 연결
#             if not node.next:
#                 node.next = new
#                 return new
#
#             cmp = recursive(node.next, new)
#             # 정렬
#             if node.val > cmp.val:
#                 # 스왑
#                 cmp.next = node
#                 return
#
#         recursive(head, ListNode(head.val))
#
#         return head


print(solution([4, 6, 2, 9, 1]))