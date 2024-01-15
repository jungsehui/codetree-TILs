hei, kg = map(int, input().split())

BMI = (kg * (100 ** 2)) / (hei ** 2)

print(int(BMI))
if BMI > 25:
    print("Obesity")