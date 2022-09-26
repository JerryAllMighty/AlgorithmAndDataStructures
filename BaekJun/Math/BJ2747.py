target = int(input())

# def recursive(n):
#     if n <= 0:
#         return 0

#     if n == 1:
#         return 1

#     return recursive(n-1) + recursive(n-2)


# print(recursive(target))


lst = [0 for _ in range(target+1)]
lst[1] = 1

for i in range(2, target+1):
    lst[i] = lst[i-1] + lst[i-2]

print(lst[target])