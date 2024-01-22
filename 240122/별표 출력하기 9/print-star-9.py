n = int(input())

for i in range(n):
    for _ in range(n - i - 1, 0, -1):
        print(" ", end=" ")
    for _ in range(1 + i * 2):
        print("*", end=" ")
    print()