n = int(input())

for i in range(n * 2):
    if i % 2 == 0:  # 홀수 번째 줄
        for j in range(1 + i // 2):
            print("*", end=" ")
        print()
    else:  # 짝수 번째 줄
        for k in range(n - (i // 2)):
            print("*", end=" ")
        print()