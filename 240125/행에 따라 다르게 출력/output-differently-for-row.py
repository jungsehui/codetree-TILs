n = int(input())
cnt = 1
even_line_number = 0

for i in range(n):
    for j in range(n):
        if i == 0:
            print(1 + j, end=" ")
        elif i % 2 == 0:  # 홀수 번째 줄 : 1씩 증가
            # print((1 + j) + (n * (1 + i)), end=" ")
            even_line_number += 1
            print(even_line_number, end=" ")
        else:  # 짝수 번째 줄 : 2씩 증가
            print(((n + 2) * i) + (2 * j), end=" ")
            even_line_number = ((n + 2) * i) + (2 * j)
    print()


# if i == 0:
#     print(1 + j, end=" ")
# elif i % 2 == 0:  # 홀수 번째 줄 : 1씩 증가
#     print((1 + j) + (n * (1 + i)), end=" ")
# else:  # 짝수 번째 줄 : 2씩 증가
#     print(((n + 2) * i) + (2 * j), end=" ")