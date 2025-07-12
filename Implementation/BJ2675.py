import sys
cnt = int(sys.stdin.readline().rstrip())
for _ in range(cnt):
  a, b = sys.stdin.readline().rstrip().split()
  answer = ''
  for j in b:
    target = j
    answer += target * int(a)
  print(answer)
