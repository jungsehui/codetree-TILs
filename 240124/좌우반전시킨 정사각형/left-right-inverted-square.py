n = int(input())

for i in range(n):
    for j in range(n, 0, -1):
        print(f"{(i + 1) * j}", end=" ")
    print()