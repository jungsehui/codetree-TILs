a, b = map(int, input().split())

for _ in range(a, b+1):
    print(a, end=' ')
    if a % 2 != 0:
        a *= 2
        if a > b:
            break
    else:
        a += 3
        if a > b:
            break