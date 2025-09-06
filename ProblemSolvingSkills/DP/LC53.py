from collections import deque
from typing import List


class Solution:
    answer = -int(1e9)
    #1
    # def maxSubArray(self, nums: List[int]) -> int:
    #     if len(nums) < 2:
    #         return sum(nums)
    #
    #     total = -int(1e9)
    #     for i in range(len(nums)):
    #         for j in range(i + 1, len(nums) + 1):
    #             cmp = sum(nums[i:j])
    #             if cmp > total:
    #                 total = cmp
    #
    #     return total

    #2
    # def maxSubArray(self, nums: List[int]) -> int:
    #     def recur(start, total):
    #         if start < 0 or start > len(nums) - 1:
    #             return
    #
    #         if total > self.answer:
    #             self.answer = total
    #
    #         if start < len(nums) - 1:
    #             recur(start + 1, total + nums[start + 1])
    #
    #     for p in range(len(nums)):
    #         recur(p, nums[p])
    #
    #     return self.answer


    #3

    # def maxSubArray(self, nums: List[int]) -> int:
    #     def recur(start, unit, total):
    #         if total > self.answer:
    #             self.answer = total
    #         if start+unit > len(nums)-1:
    #             return
    #         total = total - nums[start] + nums[start+unit]
    #
    #         recur(start+1, unit, total)
    #
    #     for p in range(1, len(nums)+1):
    #         init = 0
    #         for j in range(p):
    #             init += nums[j]
    #         recur(0, p, init)
    #
    #
    #     return self.answer


    #4
    def maxSubArray(self, nums: List[int]) -> int:
        big = -int(1e9)
        for i in range(len(nums)):
            init = nums[i]
            if init > big:
                big = init
            for j in range(i+1, len(nums)):
                init += nums[j]
                if init > big:
                    big = init
        return big
aa = Solution()
print(aa.maxSubArray([5,4,-1,7,8]))
            



