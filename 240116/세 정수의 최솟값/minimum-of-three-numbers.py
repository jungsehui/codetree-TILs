a, b, c = map(int, input().split())

arr = [a, b, c]
lowest = min(arr)

result = [num for num in arr if num == lowest]

print(*result[0])