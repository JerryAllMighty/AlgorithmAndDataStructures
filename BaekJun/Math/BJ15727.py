distance = int(input())
mok =(distance // 5)
nameojee = (distance % 5)
if nameojee == 0:
    print(mok)
else:
    print(mok + 1)