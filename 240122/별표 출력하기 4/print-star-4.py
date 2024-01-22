n = int(input())

for i in range(n):
    for _ in range(n - i):
        print("*", end=" ")
    print()

for j in range(n - 1, 0, -1):
    for _ in range(n - j + 1):
        print("*", end=" ")
    print()