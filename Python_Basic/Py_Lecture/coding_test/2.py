# 문제 2. 3과 7
# 369 방식
# 3이랑 7때 박수 치는 방식
# 결과값은 모든 박수친 횟수 출력

def solution(num):
    total_calp = 0

    clap3 = 0
    clap7 = 0

    for i in range(1, num + 1):  # 3
        if "3" in str(i):
            clap3 += str(i).count("3")
            print(i)
    print(clap3, ": 3에 박수친 횟수")

    for j in range(1, num + 1):  # 7
        if "7" in str(j):
            clap7 += str(j).count("7")
            print(j)
    print(clap7, ": 7에 박수친 횟수")

    total_clap = clap3 + clap7
    print(total_clap)

    return total_clap


solution(37)
