arr = list(map(int, input().split()))
cnt_arr = [0] * 6

for index in range(len(cnt_arr)):
    for elem in arr:
        if index + 1 == elem:
            cnt_arr[index] += 1


for num, count in enumerate(cnt_arr):
    print(f"{num + 1} - {count}")