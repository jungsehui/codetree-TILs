arr = list(map(int, input().split()))

summary = 0  # 결과
index_start = 2  # 인덱스 초항
index_add_number = 2  # 인덱스 초항에 더할 변수

for _ in range(len(arr)):
    if index_start > len(arr):
        break
    summary += arr[index_start]
    index_start += index_add_number
    index_add_number += 3

print(summary)

# n = int(input("반복할 횟수 >> "))

# start = 2
# plus_num = 2  # 여기에 3씩 더한 걸 start에 더하기


# def plus_3_e(repeat_number, start_number, plus_number):
#     first_number = start_number
#     add_number = plus_number
#     result_number = first_number

#     for i in range(repeat_number):
#         print("result = ", result_number, " /// add = ", add_number)
#         result_number += add_number
#         add_number += 3

#     return result_number


# print(plus_3_e(n, start, plus_num))
# print()

# arr = list(map(int, input().split()))

# summary = 0  # 결과
# index_start = 2  # 인덱스 초항
# index_add_number = 2  # 인덱스 초항에 더할 변수
# cnt = 0

# for _ in range(len(arr)):

#     if index_start > len(arr):
#         break
#     cnt += 1
#     print("cnt : ", cnt, "/// summary : ", summary, "/// location : ", index_start + 1, "/// changed add number : ",
#           index_add_number)
#     summary += arr[index_start]
#     index_start += index_add_number
#     index_add_number += 3

# print(summary)