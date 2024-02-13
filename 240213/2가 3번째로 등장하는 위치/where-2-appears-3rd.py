n = int(input())
n_list = list(map(int, input().split()))

cnt = 0

for i in range(n):
    if n_list[i] != 2:
        continue
    else:
        cnt += 1
        if cnt == 3:
            print(i + 1)
            break