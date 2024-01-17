a, b = list(map(int, input().split()))

answer = ""
res = a / b
answer += str(int(res)) + "."

rem = a % b
for _ in range(20):
    rem *= 10
    next_num = rem // b
    answer += str(next_num)
    rem %= b

print(answer)