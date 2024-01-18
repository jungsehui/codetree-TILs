a, b = map(int, input().split())
sumV = 0
for num in range(a, b+1):
    if num % 5 == 0:
        sumV += num

print(sumV)