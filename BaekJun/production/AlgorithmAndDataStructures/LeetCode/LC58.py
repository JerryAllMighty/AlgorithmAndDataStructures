class Solution:
  # 끝에서부터 카운트.
    def lengthOfLastWord(self, s: str) -> int:
        answer = 0
        started = False
        
        for i in range(len(s)-1, -1, -1):
            letter = s[i]
            if letter != " ":
                answer += 1
                started = True
            else:
                if started == True:
                    break
            
        return answer
        