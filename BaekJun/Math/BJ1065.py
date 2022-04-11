import sys
n = int(sys.stdin.readline().rstrip())
answers = []
for i in range(1, n+1):
  if i > 9:
    diff = int(str(i)[0]) - int(str(i)[1])
  else:
    diff = int(str(i)[0])
  bFlag = False
  for j in range(len(str(i))-1):
    if int(str(i)[j]) - int(str(i)[j+1]) != diff:
      bFlag = True
  if bFlag == False:
    answers.append(i)
print(len(answers))




      
      
