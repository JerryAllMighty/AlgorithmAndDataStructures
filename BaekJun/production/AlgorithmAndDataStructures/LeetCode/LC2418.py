from typing import List
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        # 선택 정렬
      for i in range(len(names)):
          biggest = heights[i]
          idx = -1
          for j in range(i, len(names)):
              if heights[j] > biggest:
                  biggest = heights[j]
                  idx = j

          if idx != -1:
              names[i], names[idx] = names[idx], names[i] 
              heights[i], heights[idx] = heights[idx], heights[i]            



      return names
    
print(Solution().sortPeople( ["IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"], [17233,32521,14087,42738,46669,65662,43204,8224]))
                


