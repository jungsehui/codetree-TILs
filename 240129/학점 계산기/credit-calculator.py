n = int(input())
arr = list(input().split())

s = 0
cnt = 0

for elem in arr:
    s += float(elem)
    cnt += 1

avr = s / cnt
print(f"{avr:.1f}")

if avr >= 4.0:
    print("Perfect")
elif avr >= 3.0:
    print("Good")
else:
    print("Poor")