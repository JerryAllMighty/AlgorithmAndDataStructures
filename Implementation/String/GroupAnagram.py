def solution(strArray):
    anagramDict = {}
    for i in strArray:
        key = "".join(sorted(i))
        if key in anagramDict:
            anagramDict[key].append(i)
        else:
            anagramDict[key] = [i]
    return list(anagramDict.values())


print(solution(["eat","tea","tan","ate","nat","bat"]))

# print(['a','b','c'].__contains__('a'))