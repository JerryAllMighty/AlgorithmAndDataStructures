cnt = int(input())
lst = list(map(int, input().split(' ')))
#python에서의 set은 unordered 이기 때문에 리스트로 만들어주고 난 후, 정렬
answer = list(set(lst))
answer.sort()

print(' '.join([str(i) for i in answer]))