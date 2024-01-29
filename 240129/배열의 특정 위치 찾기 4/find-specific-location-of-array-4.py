arr = list(map(int, input().split()))
s = 0
c = 0

for i in arr:
    if i != 0:
        if i % 2 == 0:
            s += i
            c += 1

print(f"{c} {s}")