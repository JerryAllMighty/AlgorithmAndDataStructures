import sys
cnt = int(sys.stdin.readline())
nums = []
for _ in range(cnt):
    num = sys.stdin.readline()
    nums.append(int(num))

print(sorted(nums, reverse=True))