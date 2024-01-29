n = int(input())
stu_cnt = 0

for _ in range(n):
    arr = list(map(int, input().split()))
    s = 0
    cnt = 0
    avr = 0

    for elem in arr:
        s += elem
        cnt += 1

    avr = s / cnt

    if avr >= 60:
        print("pass")
        stu_cnt += 1
    else:
        print("fail")

print(stu_cnt)