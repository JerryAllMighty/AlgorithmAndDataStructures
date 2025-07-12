import bisect
from typing import List


class Solution:
    # 1 80ms, 14MB
    # def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
    #     answers = []
    #     for i in nums1:
    #         if i in nums2:
    #             if i not in answers:
    #                 answers.append(i)
    #     return answers

    #2 92ms, 14.1MB
    # def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
    #     nums2.sort()
    #     answers = []
    #     for i in nums1:
    #         index = bisect.bisect_left(nums2, i)
    #         if index < len(nums2) and nums2[index] == i:
    #             if i not in answers:
    #                 answers.append(i)
    #     return answers

    #3 84ms, 14.1MB
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        A = set(nums1)
        B = set(nums2)
        return list(A&B)

