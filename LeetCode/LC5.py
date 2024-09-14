def longestPalindrome(s):
    left = 0
    length = len(s)
    while (length >= 0):
        targetString = s[left:length]
        if targetString == targetString[::-1]:
            return targetString
        else:
            right = length
            while (right < len(s)):
                left += 1
                right += 1
                targetString = s[left:right]
                if targetString == targetString[::-1]:
                    return targetString

        length -= 1
        left = 0


print(longestPalindrome("cbbd"))
