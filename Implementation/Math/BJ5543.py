burgers = []
beverage=[]
for i in range(1,6):
    if i < 4:
        burger = int(input())
        burgers.append(burger)
    else:
        bvg = int(input())
        beverage.append(bvg)


print(min(burgers) + min(beverage) - 50)
