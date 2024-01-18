n = int(input())
cnt = 0

for yoonnyeon in range(1, n+1):
    if (yoonnyeon % 4 == 0 and (yoonnyeon % 100 != 0)) or (yoonnyeon % 400 == 0):
        cnt += 1

print(cnt)