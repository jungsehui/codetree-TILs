while True:
    arr = list(input().split())
    if str(arr[2]) != 'C':
        print(int(arr[0]) * int(arr[1]))
        continue
    else:
        print(int(arr[0]) * int(arr[1]))
        break