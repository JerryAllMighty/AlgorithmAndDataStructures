import math

class Solution:
    def mySqrt(self, x: int) -> int:
        left = 0
        right = x
        
        while left <= right :
            mid = (left + right) // 2 
            calc = mid * mid
            if calc == x :
                return mid
            elif calc < x :
                left = mid + 1
            else :
                right = mid - 1
        else :
            return right