
from typing import List

class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        #문자열 기준, 큰수를 앞으로
        for p in range(1, len(nums)):
            for i in reversed(range(p, len(nums))):
                if int( str(nums[i]) + str(nums[i-1]) ) > int( str(nums[i-1]) + str(nums[i]) ):
                    nums[i-1], nums[i] = nums[i], nums[i-1]
                # print(nums)
        return "".join([str(i) for i in nums])

aa = Solution()
# 59 < 95
# 3 3
print(aa.largestNumber([0,0]))
#
#
print('330' < '303')