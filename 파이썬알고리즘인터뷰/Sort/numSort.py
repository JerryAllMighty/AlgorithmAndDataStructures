from sys import stdin

cnt = int(stdin.readline().rstrip())
nums = []
for _ in range(cnt):
    num = int(stdin.readline().rstrip())
    nums.append(num)

nums.sort()

for i in nums:
    print(i)