def quickSort(arr, low, high):
    pivot = arr[0]
    leftIdx = low
    rightIdx = high

    while (leftIdx < rightIdx):
        # pivot보다 큰 수와 작은 수를 찾는다
        for j in range(leftIdx, high + 1):
            if arr[j] > pivot:
                leftIdx = j
                break
        for k in range(rightIdx, low, -1):
            if arr[k] < pivot:
                rightIdx = k
                break

        # 찾은 수의 순서를 바꿔준다
        arr[leftIdx], arr[rightIdx] = arr[rightIdx], arr[leftIdx]
        leftIdx += 1
        rightIdx -= 1

    # left > right가 되면 right와 피벗을 바꿔준다.
    if leftIdx > rightIdx:
        arr[0], arr[rightIdx] = arr[rightIdx], arr[0]
    return rightIdx

def partition(self, arr, low, high):
    quickSort(arr, low, high)

# code here


print(quickSort([30, 45, 20, 15, 40, 25, 35, 10], 0, 7))
