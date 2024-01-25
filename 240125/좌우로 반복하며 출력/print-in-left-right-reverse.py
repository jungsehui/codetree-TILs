n = int(input())

for i in range(n):
    for j in range(n):
        if i % 2 == 0:
            print(n - ((n - 1) - j), end="")
        else:
            print(n - j, end="")
    print()