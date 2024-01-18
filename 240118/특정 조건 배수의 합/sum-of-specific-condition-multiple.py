a, b = map(int, input().split())
sumV = 0

a = min(a, b)
b = max(a, b)

for num in range(a, b+1):
    if num % 5 == 0:
        sumV += num

print(sumV)