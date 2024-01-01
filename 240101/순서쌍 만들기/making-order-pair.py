def print_pattern(n):
    for i in range(n, 0, -1):
        for j in range(n, 0, -1):
            print(f"({i},{j})", end = " ")
        print()

n = int(input())
print_pattern(n)