import sys
cnt = int(sys.stdin.readline().rstrip())

# A, B, BA, BAB, BABBA,BABBABAB, BABBABABBABBA
# 1 0, 0 1, 1 1, 1 2, 2 3, 3 5, 5 8
# 피보나치 수열의 규칙을 발견하는 것이 관건
# DP
aList = [1, 0]
bList = [0, 1]

for i in range(2, cnt+1):  
  a = aList[i-1]  + aList[i-2]
  b = bList[i-1]  + bList[i-2]

  aList.append(a)
  bList.append(b)
  
print(aList[cnt], bList[cnt])
  
  