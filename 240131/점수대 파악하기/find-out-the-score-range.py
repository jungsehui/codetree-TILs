arr = list(map(int, input().split()))
cnt_arr = [0] * 10

for index in range(len(arr)):
    for elem in arr:
        if elem == 0:
            break
            
        if elem // 10 == index + 1:
            cnt_arr[index] += 1


for index in range(len(cnt_arr), 0, -1):
    print(f"{index * 10} - {cnt_arr[index - 1]}")