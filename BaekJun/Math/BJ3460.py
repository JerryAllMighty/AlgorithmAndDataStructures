cnt  = int(input())
target = int(input())

# idx = 0
# answer = ''

# while True:
#     mok = target //2
#     nmg = target % 2

#     target = mok

#     if nmg == 1:
#         answer += str(idx) + ' '

#     if target == 1:
#         if mok == 1:
#             answer += str(idx+1) + ' '
#         break

#     idx += 1

# print(answer[:-1])

binaryNum = format(target, 'b')
print(binaryNum)
# binaryNum = [i for i in reversed(binaryNum)]
for idx, val in enumerate(binaryNum[::-1]):
    if val =='1':
        print(idx, end=' ')

        # if i != len(binaryNum)-1:
        #     answer += ' '


