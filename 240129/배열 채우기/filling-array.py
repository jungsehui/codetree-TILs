arr = []

for _ in range(10):
    n = int(input())
    if n == 0:
        break
    arr.append(n)

r_arr = arr[::-1]

print(*r_arr)