n = int(input())
# n * 2

for i in range(n):
    for j in range(n):
        if i == 0:
            print(1 + j, end=" ")
        elif i % 2 == 0:
            print((n * i) + (1 + j), end=" ")
        else:
            print((n * (i + 1)) - j, end=" ")
    print()