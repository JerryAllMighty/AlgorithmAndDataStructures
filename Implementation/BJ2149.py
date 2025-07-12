# 108080	88 pypy
# 31120	32 python3
key = input()
given = input()

# 받은 문자열을 2차원 배열로 변환
encrypted = [
    ['*' for _ in range(len(key))]
    for _ in range(len(given) // len(key))
]
idx = 0

for j in range(len(key)):
    for i in range(len(given) // len(key)):
        encrypted[i][j] = given[idx:idx + 1]
        idx += 1

# 정답도 2차원 배열 형태로 변환
decrypted = [
    ['*' for _ in range(len(key))]
    for _ in range(len(given) // len(key))
]
# 변환 순서
sortedKey = sorted(key)
orders = {}
for i in range(len(sortedKey)):
    val = sortedKey[i]
    if val not in orders.keys():
        orders[val] = [i]
    else:
        orders[val].append(i)

# 암호화된 문자열을 평문으로 복귀
for i in range(len(key)):
    order = orders.get(key[i]).pop(0)
    for j in range(len(given) // len(key)):
        decrypted[j][i] = encrypted[j][order]

print(''.join([''.join(i) for i in decrypted]))
