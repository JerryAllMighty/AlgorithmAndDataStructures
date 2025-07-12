# 31120	28 python3
# 108080	88 pypy
h1Lst = []
h2Lst = []
m1Lst = []
m2Lst = []
for _ in range(5):
    h1, h2, m1, m2 = input().split()
    h1Lst.append(h1)
    h2Lst.append(h2)
    m1Lst.append(m1)
    m2Lst.append(m2)
cmp = [h1Lst, h2Lst, ':', m1Lst, m2Lst]

lst = [
    ['###', '#.#', '#.#', '#.#', '###'],
    ['..#', '..#', '..#', '..#', '..#'],
    ['###', '..#', '###', '#..', '###'],
    ['###', '..#', '###', '..#', '###'],
    ['#.#', '#.#', '###', '..#', '..#'],
    ['###', '#..', '###', '..#', '###'],
    ['###', '#..', '###', '#.#', '###'],
    ['###', '..#', '..#', '..#', '..#'],
    ['###', '#.#', '###', '#.#', '###'],
    ['###', '#.#', '###', '..#', '###']
]
def closestTime(time):
    if time == ':':
        return ':'
    else:
        for k in range(len(lst)):
            isSame = True
            for i in range(len(time)):
                row = time[i]
                for j in range(len(row)):
                    one = row[j]
                    if one == '#' and lst[k][i][j] == '.':
                        isSame = False
                        break

            if isSame is True:
                return str(k)


answer = ''
# 00 00 과 가까운 시각이 만들어지는지 판단
for i in cmp:
    answer += closestTime(i)

print(answer)
