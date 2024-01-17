a, b = map(int, input().split())

if a >= 1:
    for _ in range(b):
        print(a, end='')
else:
    print(0)