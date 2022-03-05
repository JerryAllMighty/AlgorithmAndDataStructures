import bisect
from typing import List


class Solution:
    # 1 225ms, 15MB
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1
        while left < right:
            if numbers[left] + numbers[right] > target:
                right -= 1
            elif numbers[left] + numbers[right] < target:
                left += 1
            else:
                return [left + 1, right + 1]


aa= Solution()
print(aa.twoSum([2,7,11,15], 9))