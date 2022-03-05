#2022 0208,
def combinationSum(n, target):
    answers = []

    def dfs(num, lst):
        lst.append(num)
        total = sum(lst)
        if total == target:
            temp = [str(i) for i in lst]
            if temp not in answers:
                answers.append(temp)
            lst.pop()
            return True
        for i in n:
            if total + i <= target:
                if dfs(i, lst) == False:
                    lst.pop()
                else:
                    continue
        return False
    for i in n:
        visited = []
        dfs(i, visited)
    # dfs(7, visited)
    return answers

print(combinationSum([2,3,6,7],7))



