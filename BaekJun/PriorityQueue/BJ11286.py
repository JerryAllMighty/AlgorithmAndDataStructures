import sys, heapq

abs_heap = []
n = int(sys.stdin.readline())
for i in range(n):
	num = int(sys.stdin.readline())
	if num:
		heapq.heappush(abs_heap, (abs(num), num))
	else:
		if abs_heap:
			print(heapq.heappop(abs_heap)[1])
		else:
			print(0)

#직접 손코딩. 시간 초과 났음. 자료구조를 활용하는 것이 관건. 힙 활용할 것. 또한 딕셔너리와 함께 튜플 사용도 고려할 것.
# from collections import defaultdict

# n = int(input())

# arr = []
# answers = defaultdict(int)
# prt = []
# for _ in range(n):
#     num = int(input())

#     if num  != 0:
#         arr.append(num)
#         val = answers.get(abs(num))
#         if val != None: 
#             answers[abs(num)].append(num)
#         else:
#             answers[abs(num)]= [num]
#     else:
#         if len(arr) != 0:
#             minimum = min(answers)
#             target = min(answers.get(minimum))
#             arr.remove(target)
#             answers[minimum].remove(target)
#             prt.append(target)
            
#             if len(answers.get(minimum)) ==0:
#                 del answers[minimum]

#         else:
#             prt.append(0)


# for i in prt:
#     print(i)

