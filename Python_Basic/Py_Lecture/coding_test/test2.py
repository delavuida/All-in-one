# 문제 2. 3,7
# 369방식
# 단 369가 아니라 3이랑 7만 박수 치는 방식
# 그리고 모든 박수친 횟수 출력

# def soultion(N):
#     total_clap = 0
#
#     for num in range(1, N):
#         clap_count = num.count(3) + num.count(7)
#         total_clap += clap_count
#
#     return total_clap
#
#
# print(soultion(60))


# def solution(N):
#     total_clap = 0
#
#     digit_3 = N // 10 + 1
#
#     total_clap += digit_3 * 2
#
#     for i in range(digit_3 * 10, N+1):
#         num = i
#         while num > 0:
#             digit = num % 10
#             if digit == 3 or digit == 7:
#                 total_clap += 1
#             num //= 10
#
#     return total_clap
#
# print(solution(37))

# def count_3_and_7(n):
#     count = 0
#
#     for num in range(1, n+1):
#         while num > 0:
#             print(num) ##확인용
#             digit = num % 10 # 10으로 나누고 나머지가 3이나 7일때 clap count +1
#             if digit == 3 or digit == 7:
#                 count += 1
#             num //= 10 # num = num // 10
#             print(digit, num)
#
#
#     return count
#
# print(count_3_and_7(37))
#
# num =37
# count = 0
#
#
# while num > 0:
#     print(num, " num입니다") ##확인용
#     digit = num % 10 # 10으로 나누고 나머지가 3이나 7일때 clap count +1
#     if digit == 3 or digit == 7:
#         count += 1
#     num = num // 10
#     print(digit, num, " digit & num 입니다")
#
# print(count, "카운트입니다")

