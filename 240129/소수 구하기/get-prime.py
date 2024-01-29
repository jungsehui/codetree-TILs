i = 0
n = int(input())
count = 0

for k in range(1, n + 1):
    for i in range(2, k + 1, 1):
        if k % i == 0:  # 나누어 떨어지는 수는 소수가 아님
            break  # for문 다시 시작

    if k == i:  # k(입력받은 n1부터 n2까지 변수)를 i(2부터 시작)로 나누다가
        count += 1  # 나눠지는 수가 없어서 i가 k까지 가면 1과 k만 있으니 소수

        print(k, end=" ")  # 출력