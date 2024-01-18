n = int(input())

cnt2 = 0
cnt3 = 0
cnt12 = 0

for _ in range(n):
    if n % 12 == 0:
        cnt12 += 1
    elif n % 3 == 0:
        cnt3 += 1
    elif n % 2 == 0:
        cnt2 += 1

print(cnt2, cnt3, cnt12)