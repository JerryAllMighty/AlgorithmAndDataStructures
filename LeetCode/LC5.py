class Solution:
  def longestPalindrome(s: str) -> str:
    # Time out
    # answer = ''
    # for i in range(len(s)):
    #   for j in reversed(range(i, len(s))):
    #     target = s[i:j+1]
    #     if target == target[::-1]:
    #       if len(target) > len(answer):
    #         answer = s[i:j+1]
    #         break
    # return answer
    
    l1, r1 = 0, 3
    l2, r2 = 0, 2
    def isPalindrome(l, r):
      answer = ''
      while r <= len(s):
        target = s[l:r]
        if target == target[::-1]:
          l -=1
          r += 1
          while l >= 0 and r <= len(s):
            if s[l:r] == s[l:r][::-1]:
              target = s[l:r]
              l -=1
              r += 1
            else:
              break
            
          
          if len(target) > len(answer): 
            answer = target
        else:
          l += 1
          r += 1
          
      return answer
          
    return max(isPalindrome(l1,r1), isPalindrome(l2,r2))
      
  
  
  print(longestPalindrome('bab'))
  
  
  
      
      
      
    
      