def print_pattern(n):
    for i in range(0, n):
        for j in range(0, n):
            print(i + 1, end = "")
        print()

n = int(input())
print_pattern(n)