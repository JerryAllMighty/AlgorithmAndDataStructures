import sys
word = sys.stdin.readline().rstrip()

alphabet = [['A','B','C'],['D','E','F'],
['G','H','I'],['J','K','L'],['M','N','O'],
['P','Q','R','S'],['T','U','V'],['W','X','Y','Z']]

answer = 0

for p in word:
  idx = 0
  for i in range(len(alphabet)):
    if p in alphabet[i]:
      answer += i+3

print(answer)