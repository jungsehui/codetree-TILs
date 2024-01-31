a, b = map(int, input().split())
arr = [0] * 10
mod_cnt = 0

while a > 1:
    arr[a % b] += 1
    a //= b

for num in arr:
    mod_cnt += num ** 2

print(mod_cnt)