import heapq
from typing import List


class Solution:
    # 1 74ms, 14.2MB
    # def search(self, nums: List[int], target: int) -> int:
    #     if target in nums:
    #         return nums.index(target)
    #     else:
    #         return -1

    #2 68ms, 14.4MB
    def search(self, nums: List[int], target: int) -> int:
        pivot = 0
        for i in range(len(nums)-1):
            if nums[i] > nums[i+1]:
                pivot = i+1
        nums.sort()
        left, right = 0, len(nums) -1
        while left <= right:
            mid = (left+ right)//2
            if nums[mid] > target:
                right -=1
            elif nums[mid] < target:
                left += 1
            else:
                return (mid + pivot) % len(nums)
        return -1


aa = Solution()
print(aa.search([4,5,6,7,0,1,2], 1))

