from collections import deque
def solution(lst, n,k):
    visited = []
    cur_time = 0
    def ss(li, time, node):
        if len(visited) == n:
            return True
        if node not in visited:
            visited.append(node)
        for i in li:
            s,e,t = i[0],i[1],i[2]
            if s == node:
                if t == 1:
                    if e not in visited:
                        visited.append(e)
                    done = ss(li, time+1, e)

                else:
                    i[2] -= 1
                    done = ss(li, time + 1, s)
        if done:
            return True
        else:
            return False
    days = ss(lst, cur_time, k)
    if days:
        return cur_time
    else:
        return -1
    return cur_time



print(solution([[1,2,1],[2,1,3]], 2, 2))


