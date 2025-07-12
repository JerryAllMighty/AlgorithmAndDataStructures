cnt = int(input())
answers = []
for _ in range(cnt):
    target = input()
    answers.append(target[:1] + target[-1:])


for i in answers:
    print(i)