import sys
n = int(sys.stdin.readline())
mine = sys.stdin.readline().rstrip().split(' ')
m = int(sys.stdin.readline())
yours = sys.stdin.readline().rstrip().split(' ')


for i in yours:
    if i not in mine:
        print('no')
    else:
        print('yes')







