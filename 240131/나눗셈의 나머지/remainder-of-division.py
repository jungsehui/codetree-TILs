arr = [0] * 10

a, b = map(int, input().split())

while True:
    mod = a % b
    arr[mod] += 1

    a //= b

    if a <= 1:
        break

mod_cnt = 0

for num in arr:
    mod_cnt += num ** 2

print(mod_cnt)