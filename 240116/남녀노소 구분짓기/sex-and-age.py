s = int(input())
a = int(input())

# 19세 이상이 성인

if a >= 19:
    if s == 0:
        print("MAN")
    else:
        print("WOMAN")

else:
    if s == 0:
        print("BOY")
    else:
        print("GIRL")