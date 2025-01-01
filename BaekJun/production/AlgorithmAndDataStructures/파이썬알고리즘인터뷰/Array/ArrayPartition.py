def solution(array):
     array2 = list(reversed(sorted(array)))
     idx = 0
     n = 0
     sum = 0
     while idx < len(array2):
        sum += min(array2[idx], array2[idx + 1])
        n +=1
        idx += 2
     return sum

def aa():
    for i, n in enumerate([1,2,3,4,5]):
        print(i,n)


aa()