import bisect
from typing import List


class Solution:
    #1 180ms, 20.5MB
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(len(matrix)):
            if matrix[i][0] <= target:
                if target in matrix[i]:
                    return True
        return False
