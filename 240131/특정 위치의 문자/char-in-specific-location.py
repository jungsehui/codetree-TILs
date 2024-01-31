arr = ['L', 'E', 'B', 'R', 'O', 'S']

inp = input()
idx = -1

for i, c in enumerate(arr):
    if inp == c:
        idx = i
        break
if idx != -1:
    print(idx)
else:
    print("None")