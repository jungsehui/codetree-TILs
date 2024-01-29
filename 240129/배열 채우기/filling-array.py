arr = list(map(int, input().split()))
t_arr = []

for i in arr:
    if i == 0:
        break
    t_arr.append(i)

r_arr = t_arr[::-1]

print(*r_arr)