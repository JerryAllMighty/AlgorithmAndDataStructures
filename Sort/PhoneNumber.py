#전화 번호 사이의 거리 S
#K번째 전화번호
from sys import stdin

S, K = stdin.readline().split(' ')

#가능한 전화 번호 중 K번째로 작은 것
#서로 S만큼 다름
#총 7자리
available = [['0000000']]
#0번부터 시작
while True:
    #16진수로 가장 작은 수들부터 담아보자.
    startNum = available.pop()

#16진수로 만들기
def Hex(n1):
    
#111 160 15 10