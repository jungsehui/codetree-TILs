# n = int(input())
# n_list= list(map(int, input().split()))

# max_number = 0
# duplicated = []

# for i in range(len(n_list)):
#     if n_list[i] > max_number:
#         max_number = n_list[i]
#         if n_list[i] == max_number:
#             duplicated.append(n_list[i])
    
#     if max_number in duplicated[i]:
#         print(-1)
    
# print(max_number)

n = int(input())
numbers = list(map(int, input().split()))

def find_max_unique(numbers):
    counts = {}  # 각 숫자의 등장 횟수를 저장할 딕셔너리

    # 각 숫자의 등장 횟수를 카운트
    for num in numbers:
        counts[num] = counts.get(num, 0) + 1

    max_unique = float('-inf')  # 중복하지 않는 숫자 중 최댓값을 저장할 변수

    # 등장 횟수가 1인 숫자들 중에서 최댓값을 찾음
    for num, count in counts.items():
        if count == 1 and num > max_unique:
            max_unique = num

    return max_unique

# 중복하지 않는 숫자 중 최댓값 찾기
max_unique_number = find_max_unique(numbers)
print(max_unique_number)