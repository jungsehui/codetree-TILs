n, m = map(int, input().split())  # n은 횟수, m은 타겟 숫자
nlist = list(map(int, input().split()))
cnt = 0


for num in nlist:
    if num == m:
        cnt += 1

print(cnt)