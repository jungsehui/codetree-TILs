arr = list(map(int, input().split()))
summary = 0

for i in range(len(arr)):  # enum도 가능
    if arr[i] == 0:
        summary = arr[i - 3] + arr[i - 2] + arr[i - 1]
        break

print(summary)

# for index, elem in enumerate(arr):
#     if elem == 0:
#         summary = arr[index - 3] + arr[index - 2] + arr[index - 1]
#         break
#
# print(summary)