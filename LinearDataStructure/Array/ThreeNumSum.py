# 브루탈 포스
# def threenumsum(array):
#     answer = []
#     array.sort()
#     for i in range(len(array)-2):
#         if i > 0 and array[i] == array[i-1]:
#             continue
#         for j in range(i+1, len(array)-1):
#             if j > i+1 and array[j] == array[j - 1]:
#                 continue
#             for k in range(j+1, len(array)):
#                 if k > j+1 and array[k] == array[k - 1]:
#                     continue
#                 numSum = array[i] + array[j] + array[k]
#                 if numSum == 0:
#                     if sorted([array[i],array[j],array[k]]) not in answer:
#                         answer.append(sorted([array[i],array[j],array[k]]))
#                     # print(i,j,k)
#
#
#     return answer

# 투 포인터
class Solution():
    def threenumsum(self, array):
            answer = []
            array.sort()
            for i in range(len(array)-2):
                if i > 0 and array[i] == array[i-1]:
                    continue
                left, right = i + 1, len(array) - 1
                while left < right :
                    sum = array[i] + array[left] + array[right]
                    if sum < 0:
                        left += 1
                    elif sum > 0:
                        right -= 1
                    else:
                        answer.append([array[i], array[left], array[right]])

                        while left < right and array[left] == array[left + 1]:
                            left += 1
                        while left < right and array[right] == array[right - 1]:
                            right -= 1
                        left += 1
                        right -= 1


            return answer

print(threenumsum([1,2,-2,-1]))
