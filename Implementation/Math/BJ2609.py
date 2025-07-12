a, b = map(int,input().split(' '))

maxYaksu = 0

for i in range(1, max(a, b)+1):
    if a % i == 0 and b % i ==0:
        if i > maxYaksu:
            maxYaksu = i

minMultiple = maxYaksu * (a // maxYaksu) * (b // maxYaksu)

print(maxYaksu)
print(minMultiple)




