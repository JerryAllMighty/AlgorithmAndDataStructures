
class Solution:
    def isValid(s: str) -> bool:
        stack = []
        dic = {
            ')':'(',
            ']':'[',
            '}':'{'
        }
        for i in s:
            if i not in dic:
                stack.append(i)
            elif stack and dic[i] != stack.pop():
                return False
        return True
    print(isValid('(){}[]'))
