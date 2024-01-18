arr = list(map(int, input().split()))
sumV = 0

arr.sort()

for num in range(arr[0], arr[1] + 1):
    if num % 5 == 0:
        sumV += num

print(sumV)