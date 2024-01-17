n = int(input())
i = n

for _ in range(100 - n -1):

    if i >= 90:
        print("A", end=' ')
        i += 1
    elif i >= 80:
        print("B", end=' ')
        i += 1
    elif i >= 70:
        print("C", end=' ')
        i += 1
    elif i >= 60:
        print("D", end=' ')
        i += 1
    else:
        print("F", end=' ')
        i += 1