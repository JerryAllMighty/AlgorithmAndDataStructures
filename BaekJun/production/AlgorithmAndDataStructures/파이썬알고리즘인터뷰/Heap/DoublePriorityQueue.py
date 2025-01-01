import collections
import heapq





class PriorQueue:
    def __init__(self, q=None):
        self.q = []
        self.nq = self.Negative()

    def I(self, num):
        heapq.heappush(self.q, num)
        # self.q.append(num)
        self.nq.I(num)

    def returnMax(self):
        if self.nq.q:
            return heapq.heappop(self.nq.q)
        else:
            return 0
    def returnMin(self):
        if self.q:
            return heapq.heappop(self.q)
        else:
            return 0

    def D(self, num):
        if num <= 0:
            #최솟값 삭제
            if self.q:
                minNum = heapq.heappop(self.q)
                self.nq.q.remove(-minNum)
        else:
            #최댓값 삭제
            #최댓값 담기
            if self.nq.q:
                maxNum = heapq.heappop(self.nq.q)
                self.q.remove(-maxNum)

    class Negative:
        def __init__(self, q=None):
            self.q = []

        def I(self, num):
            heapq.heappush(self.q, -int(num))

        def D(self, num):
            return heapq.heappop(-num)



            
def solution(operations):
    answer = []
    q = PriorQueue()
    for i in operations:
        oper = i.split(' ')[0]
        if oper == "I":
            num = i.split(' ')[1]
            q.I(int(num))
        elif oper == "D":
            num = i.split(' ')[1]
            #최댓값 삭제
            if int(num) > 0:
                q.D(int(num))
            #최솟값 삭제
            else:
                q.D(int(num))
    max, min = -q.returnMax(), q.returnMin()
    answer.append(max)
    answer.append(min)
    return answer

print(solution(["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]))