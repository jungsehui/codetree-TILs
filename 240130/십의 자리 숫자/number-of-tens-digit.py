arr = list(map(int, input().split()))
cnt_arr = [0] * 9

for index, num in enumerate(arr):
    if num == 0:
        arr = arr[:index]  # 0 이전까지의 정수들만 남김
        break

for index in range(len(cnt_arr)):
    for number in arr:
        if index + 1 == number // 10:
            cnt_arr[index] += 1

for index, num in enumerate(cnt_arr):
    print(f"{index + 1} - {num}")