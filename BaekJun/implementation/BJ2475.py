import sys
import math
first, second, third, fourth, fifth = list(map(int, sys.stdin.readline().rstrip().split(' ')))

print(int((math.pow(first, 2) + math.pow(second, 2) + math.pow(third, 2) + math.pow(fourth, 2) + math.pow(fifth, 2)) % 10))