# 변수 선언, 입력
a = int(input())

# 조건을 모두 만족하지 않는 수들만 출력합니다.
for i in range(1, a + 1):
    if(i % 2 == 0 and i % 4 != 0) or (i // 8) % 2 == 0 or (i % 7) < 4:
        continue
    print(i, end=" ")