a1, a2 = map(int, input().split())

arr = [a1, a2]
for i in range(2, 10):
    arr.append(1)

for i in range(2, 10):
    arr[i] = arr[i - 1] + (arr[i - 2] * 2)

print(*arr)