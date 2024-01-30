array = list(map(int, input().split()))

for i in range(len(array)):
    if array[i] % 3 == 0:
        print(array[i - 1])
        break