n = int(input())

memoization = [0, 1]
def fiv(num):
  
  if num == 1:
    return 1
  elif num ==0:
    return 0
  else:
    if len(memoization) > num :
      return memoization[num]
    else:
      memoization.append(fiv(num-1)+fiv(num-2))
      return fiv(num-1)+fiv(num-2)
      
      
  
  
print(fiv(n))
