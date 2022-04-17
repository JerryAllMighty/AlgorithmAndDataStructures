from collections import deque
import sys
word= sys.stdin.readline().rstrip()
q = deque(word)
answer = 0
while q:
  if len(q) == 1:
    answer += 1
    break
  if len(q) == 0:
    break

  if q[0] == "l":
    if len(q) > 1 and q[1] == "j":
      q.popleft()
    q.popleft()
  elif q[0] == "n":
    if len(q) > 1 and q[1] == "j":
      q.popleft()
    q.popleft()
  elif q[0] == "c":
    if len(q) > 1 and q[1] == "=" or q[1] == "-":
      q.popleft()
    q.popleft()
  elif q[0] == "d":
    if len(q) > 2 and q[1] == "z" and q[2] == "=":
      q.popleft()
      q.popleft()
    elif q[1] and q[1] == "-":
      q.popleft()
    q.popleft()
  elif q[0] == "s":
    if len(q) > 1 and q[1] == "=":
      q.popleft()
    q.popleft()
  elif q[0] == "z":
    if len(q) > 1 and q[1] == "=":
      q.popleft()
    q.popleft()
  else:
    q.popleft()

  answer +=1


print(answer)


