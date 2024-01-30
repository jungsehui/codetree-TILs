arr = list(map(int, input().split()))
evenS = 0
oddS = 0
result = 0

for i, elem in enumerate(arr):
    if i % 2 == 0:
        oddS += elem
    else:
        evenS += elem

if evenS >= oddS:
    result = evenS - oddS
else:
    result = oddS - evenS

print(result)