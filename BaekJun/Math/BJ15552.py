import sys
cnt = int(sys.stdin.readline().rstrip())
for _ in range(cnt):
  a, b = map(int, sys.stdin.readline().rstrip().split())
  print(a + b)

# 빠른 for문 문제
# 입출력방식이 느리면 시간 초과가 날 수 있기에 참고하면 좋다.
# 단 , Python의 경우는 input()보다 sys.stdin.readline().rstrip()을
# 사용하는 하는 것이 더 빠를 수 있는데, sys.stdin.readline()는
# 마지막 개행문자를 rstrip()을 통해서 제거해주어야한다.