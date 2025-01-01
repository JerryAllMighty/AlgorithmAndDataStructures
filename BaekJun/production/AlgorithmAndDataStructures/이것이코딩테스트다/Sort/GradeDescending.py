import sys
cnt = int(sys.stdin.readline())
infos = []
for _ in range(cnt):
    name, grade = sys.stdin.readline().split(' ')
    infos.append([name, int(grade)])

print(" ".join([i[0]  for i in sorted(infos, key= lambda x:(x[1])) ]))