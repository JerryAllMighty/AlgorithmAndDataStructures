class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        return sum(i in jewels for i in stones)