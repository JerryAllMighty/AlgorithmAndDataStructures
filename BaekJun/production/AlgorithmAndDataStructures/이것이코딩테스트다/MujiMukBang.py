def solution(food_times, k):
    t = 0
    idx  = 0
    foodCnt = len(food_times)
    def findAvailable(lst, center):
        right = center + 1
        left = center -1
        length = len(lst)
        while right < length:
            if lst[right] > 0:
                return right
            right += 1

        while left >= 0:
            if lst[left] > 0:
                return left
            left -=1

        return -1

    for _ in range(k):
        t += 1
        if food_times[idx] > 0:
            food_times[idx] -= 1
        else:
            p = findAvailable(food_times, idx)
            if p == -1:
                return -1
            food_times[p] -= 1
            idx = p
            continue
        idx = (idx + 1) % foodCnt
    u = findAvailable(food_times, idx)
    return food_times[u]


print(solution([3,1,2], 5))
