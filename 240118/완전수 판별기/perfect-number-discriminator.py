n = int(input())
arr = []

for i in range(1, n):
    if n % i == 0:
        arr.append(i)

t = 0
for j in arr:
    t += j

if t == n:
    print("P")
else:
    print("N")