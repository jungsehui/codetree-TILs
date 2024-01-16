a, b = map(int, input().split())

maxN = a if a >= b else b
print(maxN)