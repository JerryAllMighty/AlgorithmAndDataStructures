#This is for those who need some python file to practice.
#이 공간은 파이썬 연습 공간입니다.

def solution(babbling):
    answer = 0
    available = ["aya", "ye", "woo", "ma"]
    stringLengthFinished = 0
    for s in babbling:
        stringLengthFinished = 0
        chkS = ""
        visited = []
        for ss in s:
            print(ss * 2)
            if chkS not in available:
                chkS += ss
            if chkS in available:
                # 연속인건 발음할 수 없다.
                if chkS in visited:
                    lastVisitString = visited.pop()
                    if lastVisitString == chkS:
                        break
                    else:
                        stringLengthFinished += len(chkS)
                        visited.append(chkS)
                        chkS = ""
                else:
                    stringLengthFinished += len(chkS)
                    visited.append(chkS)
                    chkS = ""



        if stringLengthFinished == len(s):
            answer += 1
            stringLengthFinished = 0

    return answer

print(solution(["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]))

