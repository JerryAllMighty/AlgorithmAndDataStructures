from sys import stdin
s = stdin.readline().rstrip()
mid= len(s)//2
left = s[:mid]
right = s[mid:]
l = sum([int(i) for i in left])
r = sum([int(i) for i in right])

if l == r:
    print('LUCKY')
else:
    print('READY')