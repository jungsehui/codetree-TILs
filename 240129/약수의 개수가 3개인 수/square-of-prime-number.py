start, end = map(int, input().split())
cnt = 0


for i in range(start, end + 1):
    cnt_3 = 0

    for j in range(1, i + 1):
        if i % j == 0:
            cnt_3 += 1

    if cnt_3 == 3:
        cnt += 1

print(cnt)