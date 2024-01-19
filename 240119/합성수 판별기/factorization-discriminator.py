n = int(input())
sosu = False
cnt = 0

if n > 1:
    for i in range(2, n):
        if n % i != 0:
            continue
        else:
            cnt += 1

if cnt != 0:
    print('C')
else:
    print('N')