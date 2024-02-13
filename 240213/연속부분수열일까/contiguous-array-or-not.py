n1, n2 = map(int, input().split())
n1_list = list(map(int, input().split()))
n2_list = list(map(int, input().split()))

tf = False

for i in range(n1):
    cnt = 0

    for j in range(n2):
        if i + j >= n1:
            break

        elif n1_list[i + j] == n2_list[j]:
            cnt += 1

    if cnt == len(n2_list):
        print("Yes")
        break

else:
    print("No")