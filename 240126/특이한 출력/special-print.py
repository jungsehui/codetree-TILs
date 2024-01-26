n = int(input())

for i in range(n):
    for j in range(n):
        print(f"({i + 1}, {j + 1})", end=" ")
        if ((i + 1) + (j + 1)) % 4 == 0:
            print()