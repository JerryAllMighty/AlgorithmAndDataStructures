import heapq
import math
from typing import List


class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        heap = []
        answer = []
        for i in points:
            heapq.heappush(heap, [(i[0]**2 + i[1]**2), i])

        print(heap)
        for _ in range(k):
            answer.append( heapq.heappop(heap)[1])

        return answer

aa = Solution()
print(aa.kClosest([[3,3],[5,-1],[-2,4]],2))
