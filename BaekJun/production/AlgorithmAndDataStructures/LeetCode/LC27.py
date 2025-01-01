class Solution:
  def removeElement(nums, val):
    answer = len(nums)
    while nums.count(val):
      nums.remove(val)
      answer -= 1
          
    return answer
    
  print(removeElement([0,1,2,2,3,0,4,2], 2))