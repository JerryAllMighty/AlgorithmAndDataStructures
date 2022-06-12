class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        original = ''
        for i in digits:
            original += str(i)
            
        target = int(original) + 1
        return [int(j) for j in str(target)]