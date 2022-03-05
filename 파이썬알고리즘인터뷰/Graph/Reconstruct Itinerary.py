
def ReconstructItinerary(dict):
    answers = []
    def dfs(start):
        if not dict:
            return
        same = []
        for i in dict:
            if i[0] == start:
                same.append((i[1], i))
        if not same:
            # 아직 모든 곳을 들린게 아니라면, 사전 어휘 순에서 다름 곳을 들리고 와야한다.
            # JFK > KUL로 사전 순으로 방문했찌만, 모든 곳을 못 들리므로, JFK > NRT로 방문할 수 있게.
            return
        same.sort()
        answers.append(same[0][0])
        dict.remove(same[0][1])
        dfs(same[0][0])

    answers.append("JFK")
    dfs("JFK")
    return answers

print(ReconstructItinerary([["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]))