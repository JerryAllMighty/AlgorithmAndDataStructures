import heapq
from typing import List



class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        #1 87 ms, 14.9mb
        # heapq.nlargest(k, nums)

        #2 60ms, 14.8 mb
        # return list(reversed(sorted(nums)))[k-1]
        # sorted(nums, reverse=True)

        # 3번 Time Limit
        # 큰 숫자 순서대로 소팅
        # for i in range(len(nums)-1):
        #     for pp in range(i+1, len(nums)):
        #         if nums[i] < nums[pp]:
        #             nums[pp], nums[i] = nums[i], nums[pp]
        # return nums[k-1]

        

        return nums

aa = Solution()
print(aa.findKthLargest([3,2,1,5,6,4], 5))