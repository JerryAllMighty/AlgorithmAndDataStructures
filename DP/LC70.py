class Solution:
    answer = 0

    def climbStairs(self, n: int) -> int:
        # def bfs(total):
        #     if total == n:
        #         self.answer += 1
        #         return True
        #
        #     if total > n:
        #         return False
        #
        #     for i in [1, 2]:
        #         if bfs(total + i) == True:
        #             break
        #     return False
        #
        # for p in [1, 2]:
        #     bfs(p)
        #
        # return self.answer
        mem = []
        def bfs(num):
            if num ==1:
                return 1
            if num ==2:
                return 2
            if mem[num]:
                return mem[num]
            mem[num] = bfs(num-1) + bfs(num-2)
            return mem[num]
