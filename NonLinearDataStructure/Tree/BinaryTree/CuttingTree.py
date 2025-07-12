from sys import stdin

cnt, length = stdin.readline().rstrip().split(' ')
trees = [int(i) for i in stdin.readline().rstrip().split(' ')]
height = min(trees)
up = 0
down = 0
while True:
    # 20 - h + 15 -h + 10 -h + 17 -h
    bring = sum([(i - height) for i in trees if i > height])
    print('height', height)
    print('bring',bring)

    if bring > int(length):
        down = height
        height = (max(trees) + height) //2
        print('more', height)

    elif bring < int(length):
        if down < height:
            up = height
        elif height < up:
            down = height
        height = (up+down) // 2
        print('less', height)
    else:
        break

print(height)