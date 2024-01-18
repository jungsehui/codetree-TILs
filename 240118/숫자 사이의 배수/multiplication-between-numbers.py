a, b = map(int, input().split())
sumV = 0
cnt = 0

for num in range(a, b+1):
    if num % 5 == 0 or num % 7 == 0:
        sumV += num
        cnt += 1

print(sumV, f"{sumV / cnt:.1f}")