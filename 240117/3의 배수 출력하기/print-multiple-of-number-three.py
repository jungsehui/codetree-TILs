n = int(input())
arr = list()

while n >= 1:
    if n % 3 == 0:
        arr.append(n)
        n -= 1
    else:
        n -= 1

arr.sort()
print(*arr)