import sys
from collections import Counter
target = sys.stdin.readline().rstrip()
howMany = Counter([i.lower() for i in target])
maxKey = howMany.most_common()[0][0]
maxValue = howMany.get(maxKey)
answer = maxKey.upper()
for key, value in howMany.items():
  if value == maxValue:
    if key != maxKey:
      answer = '?'


print(answer)
