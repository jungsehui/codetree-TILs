_list = list(map(int, input().split()))
cnt = 0

for num in _list:
    if num % 3 == 0:
        cnt += 1

if len(_list) == cnt:
    print(1)
else:
    print(0)