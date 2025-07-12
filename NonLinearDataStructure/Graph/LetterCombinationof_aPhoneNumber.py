def letterCombination(num):
    letters = [['a', 'b', 'c'], ['d', 'e', 'f'], ['g', 'h', 'i'], ['j', 'k', 'l'], ['m', 'n', 'o'],
               ['p', 'q', 'r', 's'], ['t', 'u', 'v'], ['w', 'x', 'y', 'z']]
    possible = []
    answers = []
    for i in num:
        possible.append(letters[int(i) - 2])

    def getCombination(lst, idx1,idx2, days):
        if idx1 == len(lst):
            return -1
        days += lst[idx1][idx2]

        #길이만큼 함수 호출
        for i in range(len(idx1)):
            getCombination(lst, idx1+1, 0, days)
    getCombination(possible, 0, 0, '')
    return answers


print(letterCombination('23'))
