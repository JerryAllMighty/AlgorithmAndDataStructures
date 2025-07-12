num = int(input())

last = 1
while True:
    summed = (1+last)*(last) //2
    if summed > num:
        break

    last += 1

print(last-1)