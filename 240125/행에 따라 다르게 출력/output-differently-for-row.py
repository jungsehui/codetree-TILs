n = int(input())
cnt1 = 1
cnt2 = 2
end_number = 0

for i in range(n):
    for j in range(n):
        if i % 2 == 0:
            print(end_number + cnt1, end=" ")
            end_number += cnt1
        else:
            print(end_number + cnt2, end=" ")
            end_number += cnt2
    print()

# if i == 0:
#     print(1 + j, end=" ")
# elif i % 2 == 0:  # 홀수 번째 줄 : 1씩 증가
#     print((1 + j) + (n * (1 + i)), end=" ")
# else:  # 짝수 번째 줄 : 2씩 증가
#     print(((n + 2) * i) + (2 * j), end=" ")