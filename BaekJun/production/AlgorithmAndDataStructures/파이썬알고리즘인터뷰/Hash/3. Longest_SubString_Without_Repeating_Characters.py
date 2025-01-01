class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s == '':
            return 0
        if len(s) == 1:
            return 1
        answer = 1
        pivot = 0
        idx = 1
        lengths = []
        while pivot < len(s)-1:
            if idx == len(s):
                pivot += 1
                idx = pivot + 1
                lengths.append(answer)
                answer = 1
                continue

            cmp = s[pivot:idx]
            if s[idx] in cmp:
                pivot +=1
                idx = pivot +1
                lengths.append(answer)
                answer =1
            else:
                idx += 1
                answer += 1
        return max(lengths)


aa = Solution()
print(aa.lengthOfLongestSubstring('bbbbb'))



