arr = list(input().split())

r_arr = arr[:: -1]

for elem in r_arr:
    print(elem, end="")