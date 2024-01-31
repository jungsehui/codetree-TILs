# 감기 증상이 있으면 Y, 감기 증상이 없으면 N으로 나타내기로 하고, 체온을 쟀을 때 수치에 따라
#
# 증상도 있고 37℃ 이상일 때 A
# 증상은 없지만 37℃ 이상일 때 B
# 증상은 있지만 체온은 정상일 때 C
# 둘 다 괜찮은 경우엔 D
# 한 번에 3명씩 검사하는데 A로 가는 사람이 2명 이상 나올때는 위급상황 E로 분류합니다.

cnt_arr = [0] * 4

for _ in range(3):
    sym, temp = input().split()

    if sym == 'Y' and int(temp) >= 37:
        cnt_arr[0] += 1
    elif sym == 'N' and int(temp) >= 37:
        cnt_arr[1] += 1
    elif sym == 'Y' and int(temp) < 37:
        cnt_arr[2] += 1
    else:
        cnt_arr[3] += 1

if cnt_arr[0] >= 2:
    cnt_arr.append('E')

print(*cnt_arr)