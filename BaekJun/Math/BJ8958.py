import sys
cnt = int(sys.stdin.readline().rstrip())
for _ in range(cnt):
  score = 0 
  toAdd = 1
  target = sys.stdin.readline().rstrip()
  for i in target:
    if i == "O":
      score += toAdd
      toAdd += 1
    else:
      toAdd = 1

  print(score) 

