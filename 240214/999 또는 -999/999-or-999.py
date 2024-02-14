nlist = list(map(int, input().split()))

maxval = nlist[0]
minval = nlist[0]

for i in range(1, len(nlist)):
    if nlist[i] == -999 or nlist[i] == 999:
        break
    elif nlist[i] >= maxval:
        maxval = nlist[i]

for i in range(1, len(nlist)):
    if nlist[i] == -999 or nlist[i] == 999:
        break
    elif nlist[i] <= minval:
        minval = nlist[i]

print(maxval, minval)