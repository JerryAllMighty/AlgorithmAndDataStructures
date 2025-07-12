from collections import deque


def Solution(n):
    q = deque([i for i in range(len(n))])
    answer = []
    while q:
        found = False
        one = q.popleft()
        for i in range(one+1, len(n)):
            if n[one] < n[i]:
                found = True
                answer.append(i - one)
                break
        if found == False:
            answer.append(0)

    return answer



print(Solution([73,74,75,71,69,72, 76, 73]))
