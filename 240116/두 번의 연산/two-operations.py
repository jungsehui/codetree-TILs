a = int(input())

if a % 2 != 0:
    a += 3
    if a % 3 == 0:
        a /= 3
        print(int(a))
    else:
        print(int(a))

elif a % 3 == 0:
    a /= 3
    print(int(a))

else:
    print(int(a))