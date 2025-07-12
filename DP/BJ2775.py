cnt = int(input())
for _ in range(cnt):  
    floor = int(input())  # 층
    num = int(input())  # 호
    f0 = [x for x in range(1, num+1)]  # 0층 리스트
    for k in range(floor):  # 층 수 만큼 반복
        for i in range(1, num):  # 1 ~ n-1까지 (인덱스로 사용)
            f0[i] += f0[i-1]  # 층별 각 호실의 사람 수를 변경
    print(f0[-1])  # 가장 마지막 수 출력
    
# answers = []
# for _ in range(cnt):
#   floor = int(input())
#   num = int(input())
  
#   counted = []
#   def recursive(f, n):
#     # f층의 n호에 살고 있는 사람의 수를 리턴
#     if f == 0:
#       counted.append(n)
#       return n
    
#     return sum([recursive(f-1, i) for i in range(1, n+1)])
    
  
    
#   answers.append(recursive(floor, num))
  
  
# for i in answers:
#   print(i)

