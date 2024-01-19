n = int(input())
# n = 128이면 x = 7이어야 함

x = 0

while True:
    if n % 2 != 1:
        n /= 2
        x += 1
    else:
        print(x)
        break