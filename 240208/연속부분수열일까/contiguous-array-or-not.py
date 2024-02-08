n1, n2 = map(int, input().split())
n1_list = list(map(int, input().split()))
n2_list = list(map(int, input().split()))
cnt = -1


# 정렬 알고리즘 쓰듯이 문제 풀기 ?
for i in range(len(n1_list)):
    if n1_list[i:i + len(n2_list)] == n2_list:
        cnt = 1

if cnt == 1:
    print("Yes")
else:
    print("No")