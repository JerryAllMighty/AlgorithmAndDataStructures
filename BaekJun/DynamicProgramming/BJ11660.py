n , m = map(int, input().split(' '))

lst = []
for _ in range(n):
  nums = list(map(int, input().split(' ')))
  lst.append(nums)
  
answers = []
for _ in range(m):
  nums = list(map(int, input().split(' ')))
  answer = 0
  for i in range(nums[0]-1, nums[2]):
    for j in range(n):
      answer += lst[i][j]
      
  for p in range(nums[1]-1):
    answer -= lst[nums[0]-1][p]
    
  for k in range(nums[3], n):
    answer -= lst[2][k]
    
  answers.append(answer)
  
for i in answers:
  print(i)
    
      
  
