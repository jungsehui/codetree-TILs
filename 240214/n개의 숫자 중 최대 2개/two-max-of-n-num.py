n = int(input())
numbers = list(map(int, input().split()))

for i in range(len(numbers)):
    for j in range(i + 1, len(numbers)):
        if numbers[i] >= numbers[j]:
            continue
        else:
            tmp = numbers[i]
            numbers[i] = numbers[j]
            numbers[j] = tmp

print(numbers[0], numbers[1])