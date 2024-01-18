n = int(input())

for num in range(1, n+1):
    if num % 2 != 0 and (num % 5 != 0 or num % 10 == 0) and (num % 3 != 0 or num % 9 == 0):
        print(num, end=" ")