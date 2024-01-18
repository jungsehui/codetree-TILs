a, b = map(int, input().split())

s = 1

for num in range(a, b+1):
        s *= num

print(s)