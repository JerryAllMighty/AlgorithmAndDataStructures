from typing import List
import collections
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        cnt = collections.Counter(nums)
        answers = []
        sortedCnt = sorted(cnt.items(), key=lambda x: x[1])
        for _ in range(k):
            print(sortedCnt)
            lastVal = sortedCnt.pop()
            answers.append(lastVal[0])

        if len(answers) < 1:
            return nums
        else:
            return answers
aa = Solution()
print(aa.topKFrequent([1,1,1,2,2,3], 2))
