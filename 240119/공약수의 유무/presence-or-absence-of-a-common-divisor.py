a, b = map(int, input().split())

num1 = 1920
num2 = 2880

sat = False

for common_pos in range(a, b + 1):
    if num1 % common_pos == 0 and num2 % common_pos == 0:
        sat = True
        break

if sat:
    print(int(sat))
else:
    print(int(sat))