# N =8
# warriors = [7,7,5,8,9,4,6,2]
# confidence = 0
#
# power = warriors[4]
# previous_power = warriors[(4-1)]
# next_power = warriors[(4+1)]
#
# if power > previous_power and power > next_power:
#     confidence += 1
#
# print(confidence)

def solution(N, warriors):


    num_warriors = len(warriors)
    confidence = 0

    for i in range((num_warriors)):
        previous_warrior = warriors[i-1]
        current_warrior = warriors[i]
        next_warriors = warriors[(i+1) % num_warriors]
        print(previous_warrior, current_warrior, next_warriors)

        if current_warrior > previous_warrior and current_warrior > next_warriors:
            confidence += 1
            print(confidence)

    return confidence


print(solution(8, [7,7,5,8,9,4,6,2]))