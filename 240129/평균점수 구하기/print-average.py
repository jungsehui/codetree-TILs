arr = input().split()
s = 0
c = 0


for elem in arr:
    s += float(elem)
    c += 1


print(f"{s / c:.1f}")