answers = []
fiv = [1, 1]
hourList = []
while True:
  try:
    num = int(input())
    hourList.append(num)
    if num == -1:
      break
    
    for i in range(2, num):
      fivNum = fiv[i-1] + fiv[i-2]
      if fivNum not in fiv:
        fiv.append(fivNum)
        
    answers.append(f'Hour {num}: {fiv[num-1]} cow(s) affected')
    
    
  except EOFError:
    break
  
for i in answers:
  print(i)