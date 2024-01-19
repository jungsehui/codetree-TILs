a, b, c = map(int, input().split())
sf = False

for num in range(a, b + 1):
    if num % c == 0:
        sf = True
        break

if sf:
    print("NO")
else:
    print("YES")