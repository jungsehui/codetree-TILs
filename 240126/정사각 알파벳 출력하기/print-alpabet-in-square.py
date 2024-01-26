n = int(input())
std = ord('A')
add_num = 0

for i in range(n):
    for j in range(n):
        print(f"{chr(std + add_num)}", end="")
        add_num += 1
    print()