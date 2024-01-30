n = int(input())
arr = list(map(int, input().split()))
cnt_arr = [0] * 9

for index in range(len(cnt_arr)):  # 인덱스 + 1번째 원소
    for elem in arr:
        if index + 1 == elem:
            cnt_arr[index] += 1

for num in cnt_arr:
    print(num)