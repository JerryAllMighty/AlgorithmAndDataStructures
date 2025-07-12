# n = int(input())
# subjects = []
# for _ in range(n):
#     subjects.append(input().split())
#
# m = int(input())
#
# answers = []
# for _ in range(m):
#     answer = 0
#     availble = input().split()
#     for i in subjects:
#         availbleLst = [availble[i] for i in range(1, len(availble))]
#         subjectsLst = [i[j] for j in range(1,len(i))]
#         bFlag = True
#         for j in subjectsLst:
#             if j not in availbleLst:
#                 bFlag = False
#                 break
#
#         if bFlag is True:
#             answer += 1
#     answers.append(answer)
#
# for j in answers:
#     print(j)


import sys


def get_binary(arr):
    cur = 0
    for num in arr:
        cur |= (1 << num - 1)
    return cur


def Test():
    n = int(sys.stdin.readline())
    choices = []
    for _ in range(n):
        temp = list(map(int, sys.stdin.readline().split()))
        choices.append(get_binary(temp[1:]))

    m = int(sys.stdin.readline())
    ans = []
    for _ in range(m):
        temp = list(map(int, sys.stdin.readline().split()))
        cur = get_binary(temp[1:])
        count = 0
        for bitmask in choices:
            if cur & bitmask == bitmask:
                count += 1
        ans.append(count)

    for c in ans:
        print(c)


if __name__ == "__Test__":
    Test()