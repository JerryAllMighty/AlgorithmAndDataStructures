import sys
word = sys.stdin.readline().rstrip()
answers = [-1 for _ in range(26)]
for j in word:
  answers[ord(j)-ord('a')] = word.find(j)

for i in answers:
  print(i)

