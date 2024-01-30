arr = list(input().split())
index = 1

for _ in range(len(arr)):
    if index < len(arr):
        print(arr[index], end=" ")
        index += 3
    else:
        break