m, n = map(int, input().split())

print(m, n, end=" ")

for i in range(3, 11):
    m, n = n, m + n
    if m >= 10:
        m -= 10
    if n >= 10:
        n -= 10
    print(n, end=" ")