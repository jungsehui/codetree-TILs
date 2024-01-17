n = int(input())

for i in range(1, n+1):
    num = i
    if num % 3 == 0 or "3" in str(num) or "6" in str(num) or "9" in str(num):
        print("0", end=' ')
    else:
        print(num, end=' ')