arr = list(map(int, input().split()))
s = 0
cnt = 0

for elem in arr:
    if elem >= 250:
        break
    s += elem
    cnt += 1

avr = s / cnt

print(f"{s} {avr:.1f}")