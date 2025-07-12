# import collections
#
#
# def permutations(numArray):
#     answer = []
#     stack = [numArray[0]]
#
#
#     for eachNum in numArray:
#         combination = []
#         combination.append(eachNum)
#         for i in numArray:
#             if i not in combination:
#                 combination.append(i)
#
#         answer.append(combination)
#
#     return answer
from typing import List

#44 ms, 14,2 MB
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        answers = []
        visited = []
        def dfs(lst, i=None):
            nonlocal visited
            if i is not None:
                visited.append(str(i))

            if len(visited) == len(lst):
                temp = [int(i) for i in visited]
                answers.append(temp)
                return

            for p in lst:
                if str(p) not in visited:
                    dfs(lst, p)
                    visited = visited[:-1]

        dfs(nums)
        return answers
aa=Solution()
print(aa.permute([0,-1,1]))
