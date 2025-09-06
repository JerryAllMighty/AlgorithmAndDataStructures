import heapq


def solution(scoville, K):
    answer = 0
    heap = []
    cnt = 0
    available = False

    for i in scoville:
        heapq.heappush(heap, i)

    def letsMix(lst):
        if len(heap) < 2:
            return -1
        leastSpicy = heapq.heappop(heap)
        leastSpicy2 = heapq.heappop(heap)
        mixed = leastSpicy + (leastSpicy2 * 2)
        heapq.heappush(heap, mixed)

    while True:
        isOkay = True
        for i in heap:
            if i < K:
                isOkay = False
                aa = letsMix(heap)
                if aa == -1:
                    return -1

                cnt += 1

        if isOkay:
            break
    return cnt