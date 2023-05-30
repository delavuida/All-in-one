def solution(N, warriors):
    max_score = 0

    for i in range(N):
        # i번째 전사를 열외시키고 남은 전사들로 새로운 리스트 생성
        remaining_warriors = warriors[:i] + warriors[i+1:]

        # 새로운 리스트로 자신감 점수 계산
    num_warriors = len(warriors)
    score = 0

    for i in range(num_warriors):
        # 인접한 두 전사의 전투력을 확인
        prev_power = warriors[(i-1) % num_warriors]
        curr_power = warriors[i]
        next_power = warriors[(i+1) % num_warriors]

        # 자신감 점수 계산
        if curr_power > prev_power and curr_power > next_power:
            score += 1

        # 현재까지의 최댓값과 비교하여 갱신
        max_score = max(max_score, score)
    return max_score


# def calculate_confidence_score(warriors):
#     num_warriors = len(warriors)
#     score = 0
#
#     for i in range(num_warriors):
#         # 인접한 두 전사의 전투력을 확인
#         prev_power = warriors[(i-1) % num_warriors]
#         curr_power = warriors[i]
#         next_power = warriors[(i+1) % num_warriors]
#
#         # 자신감 점수 계산
#         if curr_power > prev_power and curr_power > next_power:
#             score += 1

    # return score

print(solution(10,[5,3,7,6,3,3,6,1,7,8]))

