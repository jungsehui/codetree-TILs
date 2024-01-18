a, b = map(int, input().split())
s = 0

for num in range(a, b+1):
    if num % 2 == 0:
        s += num

print(s)