
def solution(cards1, cards2, goal):
    answer = 'No'
    cnt = 0
    for i in goal:
        if len(cards1) > 0 and cards1[0] == i:
            cards1.remove(cards1[0])
            cnt += 1
        if len(cards2) > 0 and cards2[0] == i:
            cards2.remove(cards2[0])
            cnt += 1

    if len(goal) == cnt:
        answer = 'Yes'

    return answer

print(solution(["i", "water", "drink"],["want", "to"],["i", "want", "to", "drink", "water"]))