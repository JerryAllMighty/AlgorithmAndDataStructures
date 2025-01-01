# def longestPalindrome(s):
#     left = 0
#     length = len(s)
#     while (length >= 0):
#         targetString = s[left:length]
#         if targetString == targetString[::-1]:
#             return targetString
#         else:
#             right = length
#             while (right < len(s)):
#                 left += 1
#                 right += 1
#                 targetString = s[left:right]
#                 if targetString == targetString[::-1]:
#                     return targetString
#
#         length -= 1
#         left = 0
def longestPalindrome(s):
    if not s:
        return ""


    def expand_around_center(s: str, left: int, right: int):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return right - left - 1


    start = 0
    end = 0

    for i in range(len(s)):
        odd = expand_around_center(s, i, i)
        even = expand_around_center(s, i, i + 1)
        max_len = max(odd, even)

        if max_len > end - start:
            start = i - (max_len - 1) // 2
            end = i + max_len // 2

    return s[start:end + 1]

print(longestPalindrome("babad"))
