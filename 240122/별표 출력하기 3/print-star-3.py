n = int(input())

for i in range(n):
    for _ in range(i * 2):
        print(" ", end="")

    for _ in range((n-i) * 2 - 1): # 2 * n - 1
        print("*", end=" ")
    
    print()