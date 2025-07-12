import sys

given = sys.stdin.readline().rstrip()

answer = ''

for i in given:
    if i.islower():
        answer += i.upper()
    else:
        answer += i.lower()

print(answer)