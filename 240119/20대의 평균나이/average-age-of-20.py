sumV = 0
cnt = 0
avr = 0

while True:
    n = int(input())
    
    if n >= 20 and n <= 29:
        sumV += n
        cnt += 1

    if not(n >= 20 and n <= 29):
        print(f"{sumV / cnt:.2f}")
        break