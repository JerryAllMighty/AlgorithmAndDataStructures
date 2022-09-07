import sys
cnt = int(sys.stdin.readline().rstrip())

for _ in range(cnt):
  floor = int(sys.stdin.readline().rstrip())
  num = int(sys.stdin.readline().rstrip())

  print(howMany(floor, num))

def howMany(floor, num):
  answer = 0
  def ref(floor, num):
    if floor == 0:
      answer += ((1+num) * num) / 2
    answer += ref(floor-1, num)
  #2, 3 >>  0 + ref(1,3) + ref(0, 3)

  return answer


