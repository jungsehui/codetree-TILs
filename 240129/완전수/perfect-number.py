def find_divisors(n):
    divisors = []
    for i in range(1, n + 1):
        if n % i == 0:
            divisors.append(i)
    return divisors

def main():
    start, end = map(int, input().split())
    cnt = 0

    for i in range(start, end + 1):
        divisors = find_divisors(i)
        sumN = sum(divisors) - i  # 자기 자신을 빼줌
        if sumN == i:
            cnt += 1

    print(cnt)

if __name__ == "__main__":
    main()