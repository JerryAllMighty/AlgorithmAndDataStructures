import collections


cnt = int(input())

lst = collections.deque([])

for _ in range(cnt):
    num = int(input())
    if len(lst) != 0:
        idx = len(lst)-1
        if lst[idx] <= num:
            lst.append(num)
        else:
            if idx == 0:
                lst.insert(0, num)
            else:
                while idx != 0:
                    idx -= 1
                    if lst[idx] <= num:
                        lst.insert(idx, num)

            

    else:
        lst.append(num)


for i in lst:
    print(i)

