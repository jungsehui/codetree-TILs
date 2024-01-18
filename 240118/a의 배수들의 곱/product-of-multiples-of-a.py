a, b = map(int, input().split())
prod = 1

for num in range(1, b+1):
    if num % a == 0:
        prod *= num

print(prod)