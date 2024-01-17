a, b = map(int, input().split())
arr = list()

for i in range(b, a-1, -1):
    n = i if i % 2 != 0
    arr.append(n)

print(*arr)