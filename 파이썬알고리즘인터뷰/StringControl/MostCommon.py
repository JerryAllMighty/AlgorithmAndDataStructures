import re
def mostCommon(word, banned):
    wordArray = word.lower().split(' ')
    wordList = []
    for i in range(len(wordArray)):
        for p in range(len(wordArray[i])):
            print(wordArray[i][p])
            if wordArray[i][p].isalpha() == True:
                wordList.append(wordArray[i][p])
    print(wordArray, wordList)
    wordCnt = {}
    for i in wordList:
        if banned.__contains__(i) or len(banned) < 1:
            continue
        key = i
        if i in wordCnt:
            value = wordCnt[key] + 1
        else:
            value = 1
        wordCnt[key] = value
    # return wordCnt
    return str.join("", [key for key,value in wordCnt.items() if value == max(wordCnt.values())])

print(mostCommon("a, a, a, a, b,b,b,c, c",["a"]))