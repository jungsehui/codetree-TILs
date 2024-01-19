a, b = map(int, input().split())

d1920 = 1920
d2880 = 2880
res = False
cnt = 0

for mod_num in (a, b + 1):
    if d2880 % mod_num == 0 and d1920 % mod_num == 0:
        cnt += 1
    else:
        continue

if cnt:
    res = True
    print(int(res))
else:
    res = False
    print(int(False))