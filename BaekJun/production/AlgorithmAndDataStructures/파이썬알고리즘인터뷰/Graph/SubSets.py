import collections


def subsets(nums):
    answers = []
    def dfs(lst, idx, lev):
        if str(nums[idx]) not in lst:
            lst += str(nums[idx])

        if lev == len(nums)-1:
            answers.append(lst)
            return

        answers.append(lst)

        for i in range(idx+1, len(nums)):
            if str(nums[i]) not in lst:
                dfs(lst, i, lev+1)

    for u in range(len(nums)):
        visited = ''
        dfs(visited, u,0)

    answers.append('')
    return answers

print(subsets([-1,1,2]))