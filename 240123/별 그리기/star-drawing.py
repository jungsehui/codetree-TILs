n = int(input())

for i in range(n):
    for _ in range(n - (i + 1)):
        print(" ", end="")
    for _ in range(1 + (i * 2)):
        print("*", end="")
    print()


for i in range(n - 1):
    for _ in range(1 + i):
        print(" ", end="")
    for _ in range(-3 + (n * 2) - (i * 2)):
        print("*", end="")
    print()


# 초항이 홀수인 등차(-2)수열 : 1 + (n * 2)