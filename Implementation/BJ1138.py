# # 108080	92 pypy
# # 31120	40 python
# n = int(input())
# tallerLst = list(map(int, input().split()))
# answer = [0 for i in range(n)]
# def findIdx(targetIdx):
#     cnt = 0
#     for i in range(len(answer)):
#         if answer[i] == 0:
#             cnt += 1
#         if cnt == targetIdx+1:
#             return i
#     return cnt
# for i in range(n):
#     idx = findIdx(tallerLst[i])
#     answer[idx] = i + 1
#
#
# print(*answer)

n = int(input())
data = list(map(int,input().split()))
ans = []
for i in range(n-1,-1,-1):
    ans.insert(data[i],i+1)

print(*ans)
