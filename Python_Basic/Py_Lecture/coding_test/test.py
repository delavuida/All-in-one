


# list.index() = (값)의 인덱스 찾기
# N = 학생수
# students = 학생들이 서있는 순서
# calls = 부르는 순서


# def calculate_time(N, students, calls):
#     second = 0
#
#
#     for num in calls:
#         position = students.index(num)  # 학생을 index 위치에서 부름
#         print(students.index(num)) # 확인용
#         print(students) # 확인용
#         second += position  #학생 인덱스를 더함
#         students.pop(position)
#
#     print(second)
#     return second
#
# calculate_time(8,[7, 3, 5, 1, 8, 6, 4, 2], [1, 2, 3, 4, 5, 6, 7, 8])
#


# def calculate_total_time(n, calls):
#     total_time = sum(call - i - 1 for i, call in enumerate(calls))
#     return total_time
#
# n = 8
# calls = [1,2,3,4,5,6,7,8]
#
# result = calculate_total_time(n, calls)
# print(result)