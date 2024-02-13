nlist = list(map(int, input().split()))

maxval = nlist[0]

for elem in nlist:
    if maxval > elem:
        continue
    else:
        maxval = elem

print(maxval)