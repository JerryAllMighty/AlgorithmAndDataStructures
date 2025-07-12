class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        answers = {}
        # 식별자를 키 값으로 가지는 딕셔너리
        for i in logs:
            eachword = i.split(' ')
            answers[eachword[0]] = [i for i in eachword if i != eachword[0]]

        isDigit = {}
        isAlpha = {}
        sameAmongAlpha = []
        # 숫자와 문자 값을 가진 친구들을 분리
        for key, value in answers.items():
            if value[0].isdigit():
                if key not in answers.keys():
                    isDigit[key] = value
                else:
                    prevVal = isDigit[key]
                    isDigit[key] = prevVal + " " + value

            if value[0].isalpha():
                if key not in answers.keys():
                    isAlpha[key] = value
                else:
                    prevVal = isAlpha[key]
                    isAlpha[key] = prevVal + " " + value
        # 만일 문자가 동일한 경우 식별자 순으로 소팅
        sortedAlpha = sorted(isAlpha.items(), key=lambda x: (x[1], x[0]))
        final = []
        # 최종 문자 합침
        for key, value in sortedAlpha:
            for v in value:
                key += " " + v
            final.append(key)

        for key, value in isDigit.items():
            for v in value:
                key += " " + v
            final.append(key)
        return final