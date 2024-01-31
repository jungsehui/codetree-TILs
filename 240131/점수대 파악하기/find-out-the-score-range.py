arr = list(map(int, input().split()))
cnt_arr = [0] * 10


for elem in arr:
    if elem == 0:
        break
    elif elem < 10:
        continue

    index = elem // 10
    cnt_arr[index - 1] += 1


for index in range(len(cnt_arr), 0, -1):
    print(f"{index * 10} - {cnt_arr[index - 1]}")