def combinations(n, k):

    def graph(num):
        nonlocal answers
        nonlocal each
        each+=(str(num))
        length = 0

        if len(each) >= k:
            if each not in answers:
                answers.append(each)
            each = each[:-1]
            return

        for i in range(num+1, n+1):
            graph(i)
        each = each[:-1]
    for i in range(1,n+1):
        each = ''
        graph(i)
    return answers

print(combinations(4,3))