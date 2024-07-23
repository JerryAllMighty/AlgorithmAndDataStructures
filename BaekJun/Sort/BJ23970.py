import sys
input = sys.stdin.readline

N = int(input())
A = list(map(int, input().strip().split()))
B = list(map(int, input().strip().split()))

def bubble_sort(A, B):
    # 배열의 길이가 n이라면 패스는 (n-1)번 수행됨
    for i in range(N - 1, 0, -1):
        for j in range(i):
            if A[j] > A[j+1]:
                A[j], A[j+1] = A[j+1], A[j]
                if A[j+1] == B[j+1]:
                    if A == B:
                        print(1)
                        sys.exit(0)
    print(0)

# 만약 입력받은 배열 A와 B가 일치한다면?
if A == B:
    print(1)
    sys.exit(0)
else:
    bubble_sort(A, B)