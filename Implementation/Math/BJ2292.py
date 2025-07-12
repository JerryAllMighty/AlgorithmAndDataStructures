
target = int(input())

layer = 1
maxNum = 1
iterable = True

if target == 1:
    print(1)
    iterable = False

while iterable:

    maxNum += layer * 6

    if maxNum >= target:
        print(layer+1)
        break
        
    else:
        layer += 1
