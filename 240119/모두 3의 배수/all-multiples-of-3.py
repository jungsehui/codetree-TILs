_list = list()
cnt = 0


for _ in range(5):
    n = int(input())
    _list.append(n)


for num in _list:
    if num % 3 == 0:
        cnt += 1

if len(_list) == cnt:
    print(1)
else:
    print(0)