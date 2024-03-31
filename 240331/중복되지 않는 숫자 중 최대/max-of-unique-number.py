n = int(input())
n_list= list(map(int, input().split()))

max_number = 0
cnt = 0

for elem in n_list:
    if elem > max_number:
        max_number = elem

print(max_number)