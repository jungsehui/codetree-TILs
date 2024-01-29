# n = int(input())
# prime_num_list = []
#
#
# for i in range(2, n + 1):
#     for k in range(2, int(i ** 0.5) + 1):
#         if i % k == 0:
#             break
#
#         if i == k:
#             prime_num_list.append(i)
#
# print(*prime_num_list)

n = int(input())
prime_num_list = []

for i in range(2, n + 1):
    is_prime = True

    for k in range(2, int(i ** 0.5) + 1):
        if i % k == 0:
            is_prime = False
            break

    if is_prime:
        prime_num_list.append(i)

print(*prime_num_list)