import sys

# 한 줄에 하나의 정수를 입력으로 받을 때
n = int(sys.stdin.readline())

# 한 줄에 여러 개의 정수를 입력으로 받을 때
arr = list(map(int, sys.stdin.readline().split()))

max_number = 0
duplicated = []

for i in range(n):
    if arr[i] in duplicated:
        continue

    if arr[i] in arr[i + 1:]:
        duplicated.append(arr[i])
        continue

    if arr[i] > max_number:
        max_number = arr[i]
    
if max_number == 0:
    print(-1)
else:
    print(max_number)