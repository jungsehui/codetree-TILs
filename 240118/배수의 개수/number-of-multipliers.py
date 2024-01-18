cnt = 0

for _ in range(10):
    n = int(input())
    if n % 3 == 0 or n % 5 == 0:
        cnt += 1

print(cnt)