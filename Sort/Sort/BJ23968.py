# import sys
# size, changeNum = map(int, sys.stdin.readline().split())

# lst = list(map(int, sys.stdin.readline().split()))

# cnt = 0
# answerA, answerB = 0, 0
# for i in range(1, len(lst)):
#   for j in range(i, len(lst)):
#     if lst[j-1] > lst[j]:
#       answerA, answerB = lst[j], lst[j-1]
#       lst[j], lst[j-1] = lst[j-1], lst[j]
#       cnt +=1
      
#     if cnt == changeNum:
#       break
  
# if cnt < changeNum:
#   print(-1)
# else: 
#   print(answerA, answerB)
      

import sys

n, k = map(int, sys.stdin.readline().split())
nums = list(map(int, sys.stdin.readline().split()))

count = 0
answer = -1

for i in range(n-1, 0, -1):
	for j in range(i):
		if nums[j] > nums[j+1]:
			count += 1
			nums[j], nums[j+1] = nums[j+1], nums[j]

			if count == k:
				answer = f'{nums[j]} {nums[j+1]}'	

print(answer)
