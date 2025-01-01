def quicksort(lst, start, end):
    def partition(part, ps, pe):
        pivot = part[pe]
        i = ps - 1
        for j in range(ps, pe):
            if part[j] <= pivot:
                i += 1
                part[i], part[j] = part[j], part[i]

        part[i+1], part[pe] = part[pe], part[i+1]
        return i+1

    if start >= end:
        return None

    p = partition(lst, start, end)
    quicksort(lst, start, p-1)
    quicksort(lst, p+1, end)
    return lst




print(quicksort([4, 6, 2, 9, 1], 0, 1))