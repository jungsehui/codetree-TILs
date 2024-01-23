n = int(input())

for i in range(n):  # n번 반복
    for _ in range(n - i):
        print("*", end="")

    for _ in range(i * 2):
        print(" ", end="")

    for _ in range(n - i):
        print("*", end="")

    print()