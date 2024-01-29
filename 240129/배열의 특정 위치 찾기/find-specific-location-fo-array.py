arr = list(map(int, input().split()))
es = 0
s3 = 0
ec = 0
c3 = 0

for index, elem in enumerate(arr):
    if index % 2 == 1:
        es += elem
        ec += 1
    if index % 3 == 2:
        s3 += elem
        c3 += 1

print(f"{es} {s3 / c3:.1f}")