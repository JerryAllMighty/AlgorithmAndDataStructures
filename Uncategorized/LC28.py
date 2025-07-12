class Solution:
    def strStr(haystack: str, needle: str) -> int:
        answer = 0
        try:
          answer = haystack.index(needle)
        except:
          answer = -1
        
        return answer
      
    print(strStr("aaaaa","bba"))