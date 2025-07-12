from collections import Counter

class Solution:
  def singleNumber(nums):
    cnt = Counter(nums)
    for key, value in cnt.items():
      if value == 1:
        return key
        
        
  singleNumber([1])
            