
def solution(n):
    count = 0

    for num in range(1, n+1):
        while num > 0:
            print(num, "num 확인") ##확인용
            digit = num % 10  # 현재 자릿값 추출
            if digit == 3 or digit == 7:
                count += 1
            num //= 10  #
            print(digit, num, "digit, num 확인")
    return count

print(solution(37))