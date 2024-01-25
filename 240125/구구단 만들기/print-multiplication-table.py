import time

a, b = map(int, input().split())
num_list = []

for i in range(b, a - 1, -1):
    if i % 2 == 0:
        num_list.append(i)


for j in range(1, 10):
    for k in num_list:
        print(f"{k} * {j} = {k * j}", end="")
        if k != num_list[-1]:
            print(" / ", end="")
        else:
            continue
    print()