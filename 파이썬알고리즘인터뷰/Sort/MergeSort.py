from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        #쪼개고
        def splice(lst):
            if len(lst) <= 1:
                return lst
            mid = len(lst) //2
            L = lst[:mid]
            R = lst[mid:]
            oneL = splice(L)
            oneR = splice(R)
            sorted_lst = sort_pieces(oneL, oneR)
            return sorted_lst
        #쪼갠 걸 정렬하며 합친다
        #[8], [4,5]
        def sort_pieces(oneL, oneR):
            i = 0
            j = 0
            new = []
            while i < len(oneL) and j < len(oneR):
                if oneL[i] < oneR[j]:
                    new.append(oneL[i])
                    i+=1
                else:
                    new.append(oneR[j])
                    j += 1

            while j == len(oneR) and i < len(oneL):
                new.append(oneL[i])
                i += 1

            while i == len(oneL) and j < len(oneR):
                new.append(oneR[j])
                j+=1
            return new

        return splice(intervals)


aa = Solution()
print(aa.merge([[1,3],[2,6],[8,10],[15,18]]))