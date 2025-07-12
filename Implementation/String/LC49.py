import collections


def groupAnagrams(strs):
    anagrams = collections.defaultdict(list)
    for s in strs:
        anagrams[''.join(sorted(s))].append(s)
    return list(anagrams.values())


print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
