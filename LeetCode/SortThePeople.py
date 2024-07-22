class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        heightsMap = {}

        for i in range(len(heights)):
            heightsMap[i] = heights[i]

        heightsMap = sorted(heightsMap.items(), key=lambda x: x[1], reverse=True)
        answers = []
        for key, value in heightsMap:
            answers.append(names[key])
        return answers
