a, b, c = map(int, input().split())
sf = False

for i in range(a, b + 1):
    if i % c == 0:
        sf = True

if sf:
    print("YES")
else:
    print("NO")