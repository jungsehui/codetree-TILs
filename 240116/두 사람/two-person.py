age1, s1 = input().split()
age2, s2 = input().split()

if int(age1) >= 19 or int(age2) >= 19:
    if s1 == "M" or s2 == "M":
        print("1")
    else:
        print("0")

else:
    print("0")