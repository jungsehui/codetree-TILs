num_arr = list(map(int, input().split()))

max = num_arr[0]

for num in num_arr:
    if num >= max:
        max = num

print(max)