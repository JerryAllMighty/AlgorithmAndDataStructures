from collections import deque
from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # #쪼개고
        # def splice(lst):
        #     if len(lst) <= 1:
        #         return lst
        #
        #     mid = len(lst)//2
        #     left = lst[:mid]
        #     right= lst[mid:]
        #     L = splice(left)
        #     R = splice(right)
        #     return mer(L,R)
        #
        # def mer(L, R):
        #     a= len(L[0])-1
        #     b=len(R[0])-1
        #     #합친 리스트
        #     e = []
        #     for i in L:
        #         e.append(i)
        #     for i in R:
        #         e.append(i)
        #     e.sort()
        #     q= deque(e)
        #     answer = []
        #
        #     while len(q) > 1:
        #         one = q.popleft()
        #         two = q.popleft()
        #         if one[a] >= two[0]:
        #             merged = []
        #             merged.append(min(one[0], two[0]))
        #             merged.append(max(one[a], two[b]))
        #             q.insert(0, merged)
        #             if merged not in answer:
        #                 answer.append(merged)
        #         else:
        #             if one not in answer:
        #                 answer.append(one)
        #                 if two not in answer:
        #                     answer.append(two)
        #                     q.insert(0, two)
        #                 else:
        #                     q.insert(0, one)
        #
        #             if two not in answer:
        #                 answer.append(two)
        #                 q.insert(0, two)
        #
        #     if len(q) == 1:
        #         one = q.popleft()
        #         if one not in answer:
        #             answer.append(one)
        #     return answer
        # intervals.sort()
        # return splice(intervals)
        intervals.sort(key = lambda x:(x[0], x[1]))
        idx = 0
        while idx < len(intervals)-1:
            if intervals[idx][1] >= intervals[idx+1][0]:
                intervals[idx] = [max(intervals[idx][0],intervals[idx+1][0]), max(intervals[idx+1][1],intervals[idx+1][1])]
                intervals.remove(intervals[idx+1])
            else:
                idx +=1
        return intervals



aa = Solution()
print(aa.merge([[1,4],[4,5]]))