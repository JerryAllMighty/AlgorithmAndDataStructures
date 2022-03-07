def isPalindrome(n):
    s = ''
    for i in n:
        if i.isalnum() == True:
            s += (i)
    s = s.lower()
    return s == s[::-1]


print(isPalindrome('Mo,m'))