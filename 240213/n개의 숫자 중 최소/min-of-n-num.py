n = int(input())
nlist = list(map(int, input().split()))

minval = nlist[0]
cnt = 0

for elem in nlist[1:]:
    if minval < elem:
        continue
    else:
        minval = elem

for elem in nlist:
    if minval == elem:
        cnt += 1
        
print(minval, cnt)