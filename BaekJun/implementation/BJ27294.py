time, drink = map(int, input().split(' '))

if drink == 1 or time < 12 or time > 16:
  print(280)
else:
  print(320)