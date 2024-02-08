n1, n2 = map(int, input().split())
n1_list = list(map(int, input().split()))
n2_list = list(map(int, input().split()))

cnt = 0

for i in range(n1):

    for j in range(n2):
        if i + j >= n1:
            break

        if n1_list[i + j] == n2_list[j]:
            cnt += 1

    if cnt ==len(n1_list):
        break

if cnt == len(n1_list):
    print("Yes")
else:
    print("No")