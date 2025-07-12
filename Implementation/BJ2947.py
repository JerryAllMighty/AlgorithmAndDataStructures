lst = list(map(int, input().split(' ')))
cmp = [i for i in range(1, 6)]
if lst == cmp:
    print(' '.join(lst))
else:
    while lst != cmp:
        for i in range(4):
            if lst[i] > lst[i+1]:
                lst[i], lst[i+1] = lst[i+1], lst[i]
                print(' '.join([str(j) for j in lst]))

        






