n = int(input())

for i in range(n):  # n번 반복
    for _ in range(n - i):
        print("*", end="")

    for _ in range(i):
        print(" ", end="")

    for _ in range(i):
        print(" ", end="")

    for _ in range(n - i):
        print("*", end="")
        
    print()