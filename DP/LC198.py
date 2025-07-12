from typing import List


class Solution:
    total = -int(1e9)

    def rob(self, nums: List[int]) -> int:
        def recur(start, hap):
            if start < 0 or start > len(nums) - 1:
                return

            if hap > self.total:
                self.total = hap

            for i in range(start + 2, len(nums)):
                recur(i, hap + nums[i])

        for p in range(len(nums)):
            recur(p, nums[p])

        return self.total
        # def recur(lst, hap):
        #     if not lst:
        #         return 0
        #     if hap > self.total:
        #         total = hap
        #     idx = lst.index(max(lst))
        #     left = recur(lst[:idx-1])
        #     right = recur(lst[idx+1:])
        #     return hap + max(left, right)
