from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #1번 방법, 57ms, 13.9MB
        # nums.sort()

        #2번 방법 71ms, 14.1MB
        # def quicksort(lst, start,end):
        #     def partition(part, ps, pe):
        #         pivot = part[pe]
        #         i = ps - 1
        #         for j in range(ps, pe):
        #             if part[j] <= pivot:
        #                 i += 1
        #                 part[i], part[j] = part[j], part[i]
        #
        #         part[i+1], part[pe] = part[pe], part[i+1]
        #         return i+1
        #
        #
        #     if start >= end:
        #         return None
        #
        #     p = partition(lst, start, end)
        #     quicksort(lst, start, p-1)
        #     quicksort(lst, p+1, end)
        #
        # quicksort(nums, 0, len(nums)-1)





aa = Solution()
print(aa.sortColors(([2,0,2,1,1,0])))