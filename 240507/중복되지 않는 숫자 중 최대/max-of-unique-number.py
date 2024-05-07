n = int(input())
n_list= list(map(int, input().split()))

max_number = max(n_list)  # 리스트에서 최댓값을 찾음

# 중복되지 않는 숫자 중에서 최댓값을 찾음
for num in n_list:
    if n_list.count(num) > 1:  # 현재 숫자가 중복되면 넘어감
        continue
    if num > max_number:
        max_number = num

if max_number in n_list:  # 최댓값이 리스트에 있으면 -1 출력
    print(max_number)
else:
    print(-1)  # 최댓값 출력