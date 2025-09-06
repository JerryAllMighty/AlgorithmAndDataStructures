h,y=map(int,input().split())

money=[0 for i in range(11)]
money[0]=h
money[1]=int(h*1.05)
money[2]=int(money[1]*1.05)
money[3]=int(h*1.20)
money[4]=max(int(money[3]*1.05), int(money[1]*1.2))

for i in range(5,y+1):
    money[i]=max(int(money[i-5]*1.35),int(money[i-3]*1.20),int(money[i-1]*1.05))
print(money[y])