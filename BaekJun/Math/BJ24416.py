
n = int(input())


class bj24416:
    recCnt = 0
    dpCnt = 0

#재귀
    def recursive(self, n):
        
        if n == 1 or n ==2 :
            self.recCnt += 1
            return 1 
        else:
            return self.recursive(n -1 ) + self.recursive(n - 2)

#다이내믹 프로그래밍
    def dp(self, n):
        dpList = [0 for i in range(n)]
        dpList[0] = 1
        dpList[1] = 1

        for i in range(2, n):
            self.dpCnt += 1
            dpList[i] = dpList[i - 1] + dpList[i - 2]
        
#함수 호출
instance = bj24416()
recCnt, dpCnt = instance.recursive(n), instance.dp(n)

print(instance.recCnt, instance.dpCnt)