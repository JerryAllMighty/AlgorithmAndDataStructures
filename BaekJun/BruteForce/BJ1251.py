target = input()

availableList = []

for i in range(1, len(target)):
  for j in range(i+1, len(target)):
    one = target[:i]
    two = target[i:j]
    three = target[j:]
    
    availableList.append(one[::-1] + two[::-1] + three[::-1])


availableList.sort()

print(availableList[0])
