arr = list(map(int, input().split()))

n = len(arr)

for i in range(n):
    for j in range(0, n-i-1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]

middle_num = arr[int(len(arr) / 2)]
print(middle_num)