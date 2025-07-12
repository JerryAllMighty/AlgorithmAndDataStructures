
def solution(n, arr1, arr2):
  answer = []
  
  for i in range(n):
    #이진수 문자열로 리턴하는 함수
    a = toBinary(n, arr1[i])
    b = toBinary(n, arr2[i])
  
    lst = []
  
    for j in range(n):
      
      # 하나라도 벽이면 벽,
      # 모두 공백이면 공백
      if a[j] == '0' and b[j] == '0':
        lst.append(' ')
      else:
        lst.append('#')
    
    str = ''.join(lst)
    
    answer.append(str)
      
  
  
  
  return answer
  
  
def toBinary(n, num):
  binary = ["0" for _ in range(n)]
  target = num
  idx = n - 1
  
  while True:
    nmg = target % 2
    binary[idx] = str(nmg)
    target = target // 2
    idx -= 1
    if target < 2:
      binary[idx] = str(target)
      break
    
  return "".join(binary)
  
# print(solution(6, [46, 33, 33 ,22, 31, 50], 	[27 ,56, 19, 14, 14, 10]))

# print(toBinary(5, 9))