n = int(input())

fst_n = 1
snd_n = n
print(fst_n, snd_n, end=" ")

while True:
    fst_n, snd_n = snd_n, fst_n + snd_n

    print(snd_n, end=" ")
    if fst_n > 100 or snd_n > 100:
        break