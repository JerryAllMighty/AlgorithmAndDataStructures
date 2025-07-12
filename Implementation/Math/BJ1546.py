import sys
import statistics
cnt = int(sys.stdin.readline().rstrip())
newGrades = []
grades = list(map(int, sys.stdin.readline().rstrip().split()))
maxGrade = max(grades)
for i in grades:
  newGrades.append(i/maxGrade*100)

print(statistics.mean(newGrades))
  


