n = int(input())

# 1부터 n까지의 3의 배수 출력
i = 1
while i <= n:
    if i % 3 == 0:
        print(i, end=' ')
    i += 1