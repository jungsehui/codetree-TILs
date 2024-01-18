n = int(input())

for num in range(1, n + 1):
    if num % 2 == 0:
        continue
    if num % 10 == 5:
        continue
    if num % 3 == 0 and num % 9 != 0:
        continue

    print(num, end=" ")