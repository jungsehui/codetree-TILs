s = 0
c = 0

for _ in range(10):
    num = int(input())
    if num >= 0 and num <= 200:
        s += num
        c += 1

print(s, f"{s / c:.1f}")