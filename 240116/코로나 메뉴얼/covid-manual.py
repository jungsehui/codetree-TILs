# 증상 유, 37도

pos1, tmp1 = input().split()
pos2, tmp2 = input().split()
pos3, tmp3 = input().split()

A = 0
B = 0
C = 0
D = 0

for i in range(1, 4):
    pos = eval(f"pos{i}")
    tmp = eval(f"tmp{i}")

    if pos == 'Y' and int(tmp) >= 37:
        A += 1

    if pos == 'N' and int(tmp) >= 37:
        B += 1

    if pos == 'Y' and int(tmp) < 37:
        C += 1

    if pos == 'N' and int(tmp) < 37:
        D += 1

if A >= 2:
    print('E')
else:
    print('N')