# n = int(input())
# n_list= list(map(int, input().split()))

# max_number = 0
# duplicated = []

# for i in range(n):
#     if n_list[i] in duplicated:
#         continue

#     if n_list[i] > max_number:
#         max_number = n_list[i]

#     if n_list[i] == max_number:
#         duplicated.append(n_list[i])
    
#     if max_number in duplicated[i]:
#         print(-1)
    
# print(max_number)


n = int(input())
arr = list(map(int, input().split()))

max_val = 0
dup = []
for i in range(n):
    if arr[i] in dup:
        continue
    
    if arr[i] in arr[i + 1:]:
        dup.append(arr[i])
        continue

    if arr[i] > max_val:
        max_val = arr[i]

if max_val == 0:
    print(-1)
else:
    print(max_val)