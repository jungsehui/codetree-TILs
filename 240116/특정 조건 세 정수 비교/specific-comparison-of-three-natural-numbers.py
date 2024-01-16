a, b, c = map(int, input().split())

lowest = min(a, b, c)

if a == lowest:
    print(int(True), end=" ")
else:
    print(int(False), end=" ")

if a == b and b == c:
    print(int(True), end=" ")
else:
    print(int(False), end=" ")