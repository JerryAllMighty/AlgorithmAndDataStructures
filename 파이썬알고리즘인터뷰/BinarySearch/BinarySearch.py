from bisect import bisect
from typing import List
import math

class Solution:
    # 1 414ms, 15.5MB
    # def search(self, nums: List[int], target: int) -> int:
    #     if target in nums:
    #         return nums.index(target)
    #     else:
    #         return -1

    #2 402ms 15.5MB
    # def search(self, nums: List[int], target: int) -> int:
    #     left, right = 0, len(nums)-1
    #     while left < right:
    #         mid = (left + right)//2
    #         if nums[mid] < target:
    #             left += 1
    #         elif nums[mid] > target:
    #             right -= 1
    #         else:
    #             return mid
    #     return -1

    #3 321 ms, 15.4MB
    def search(self, nums: List[int], target: int) -> int:
        index = bisect.bisect_left(nums, target)
        if index < len(nums) and nums[index] == target:
            return index
        else:
            return -1


aa = Solution()
print(aa.search([-1,0,3,5,9,12],2))




