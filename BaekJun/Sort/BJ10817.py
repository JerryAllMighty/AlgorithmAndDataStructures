import sys

a, b, c = list(map(int, sys.stdin.readline().rstrip().split(' ')))

nums = [a,b,c]

top = max(nums)

nums.remove(top)

print(max(nums))