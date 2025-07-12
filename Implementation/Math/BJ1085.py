import sys

x, y, w, h = list(map(int, sys.stdin.readline().rstrip(' ').split(' ')))

# 문제 설명이 부족해서 처음에 이해를 잘못했다. 
# 시작점  x,y 는 사각형의 내부에 있다고 가정.
# y의 값의 가능한 값은 h-y와 y이다
# x의 가능한 값은 w-x와 x이다.
# https://ooyoung.tistory.com/102
print(min(x, y, w-x, h-y))