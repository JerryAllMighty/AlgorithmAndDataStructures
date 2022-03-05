class Solution:
    def longestPalindrome(self, s: str) -> str:
        # left = 0
        # right = len(s)
        # answer = ''
        # while left < len(s):
        #     cur = s[left:right]
        #     if cur != cur[::-1]:
        #         right -=1
        #         continue
        #     else:
        #         if len(cur) > len(answer):
        #             answer = cur
        #         left += 1
        #         right = len(s)
        #         continue
        # return answer
        def expand(left, right):
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            return s[left + 1:right]

        if len(s) < 2 or s == s[::-1]:
            return s

        result = ''

        for i in range(len(s) - 1):
            result = max(result, expand(i, i + 1), expand(i, i + 2), key=len)

        return result


aa = Solution()
# print(aa.longestPalindrome("babad"))
print(aa.longestPalindrome("babad"))