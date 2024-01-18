n = int(input())
s = 0
c = 0
a = 0

for _ in range(n):
    num = int(input())
    s += num
    c += 1

a = s / c

print(s, f"{a:.1f}")