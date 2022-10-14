cnt = int(input())
answers = []
for _ in range(cnt):
    sentence = input().split(' ')
    answer = ' '.join([i[::-1] for i in sentence])
    answers.append(answer)

for i in answers:
    print(i)