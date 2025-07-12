class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = len(set(nums))
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                for j in range(i + 1, len(nums)):
                    if nums[i] == nums[j]:
                        nums[j] = 1e9
                    else:
                        break
        nums.sort()
        return k

