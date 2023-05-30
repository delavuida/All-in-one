

N = 9
students = [7,3,2,5,1,6,8,9,10,4]
calls = [9,2,1,5,4,6,8,10,3,7]

total_time = 0


for call in calls:
    index = students.index(call)  # 호출된 학생의 위치 인덱스를 구함
    total_time += index  # 호출된 학생의 뒤에 있는 학생들이 이동하는 시간을 더함
    students.pop(index)  # 호출된 학생을 줄에서 제거

    print(total_time)