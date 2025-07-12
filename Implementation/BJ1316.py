import sys
from collections import deque
cnt = int(sys.stdin.readline().rstrip())
answer = 0

for _ in range(cnt):
  word = sys.stdin.readline().rstrip()
  q = deque(word)
  used = []
  isGroup = True
  while q:
    one = q.popleft()
    if one not in used:
      used.append(one)
    else:
      anotherOne = used.pop()
      if one == anotherOne:
        used.append(anotherOne)
      else:
        isGroup = False
        break
  if isGroup:
    answer += 1


print(answer)
