lst = []
for _ in range(5):
    score = int(input())
    if score <= 40:
        score = 40
    lst.append(score)

print(sum(lst) // 5)