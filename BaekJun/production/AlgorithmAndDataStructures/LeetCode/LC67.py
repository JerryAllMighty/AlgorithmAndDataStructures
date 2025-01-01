  #문자열로 이루어진 두  이진수의 덧셈 결과를 리턴.
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        decimaldays = self.toDecimalAndSum(a, b)
        binarydays = self.toBinary(decimaldays)
      
        return binarydays


    def toDecimalAndSum(self, a, b):
        decimalA = 0
        decimalB = 0
        for i in range(0, len(a)):
            decimalA += (2 ** i) * int(a[len(a) - 1 - i])

        for i in range(0, len(b)):
            decimalB += (2 ** i) * int(b[len(b) - 1 - i])

        return decimalA + decimalB



    def toBinary(self, decimaldays):
        if decimaldays == 0:
            return "0"
        
        binarydays = ""
        mok = decimaldays
        while mok > 0:
            if mok == 1:
                binarydays = str(mok) + binarydays
                break

            mokNow = mok // 2
            nmgNow = mok % 2
            mok = mokNow
            if mok > 0:
                binarydays =  str(nmgNow) + binarydays

        return binarydays