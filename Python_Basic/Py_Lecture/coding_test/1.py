def solution(N, students, calls):
    answer = 0

    for n in calls:
        position = students.index(n)
        print(students.index(n)) #확인용
        print(students) # 확인용
        answer += position  # 학생이 있는 인덱스를 더함
        students.pop(position)  
    print(answer)
    print(type(answer))
    return answer

solution(8, [7,3,5,1,8,6,4,2], [1,2,3,4,5,6,7,8])
# N = 학생수, students = 학생들이 서있는 순서
# student [7] = 학생번호 (인덱스안에 있는 값)
# calls 부르는 순서

#
# students =[7,3,5,1,8,6,4,2]
#
# print(students.index(5)) # index()는 (값)이 어디 인덱스에 있는 확인

# 반복문
arr = [1,2,4,5,6,]
for i in arr:
    print(arr.index(i))

array = []
for i in range(20):
    if i % 2 == 1:
        array.append(i)
print(array, "#0")

# 리스트 컴프리헨션
array = [i for i in range(20) if i % 2 == 1]
# i를 20번 반복하고 if i의 나누기 2 나머지가 1일때 그 값을 array에 넣어라
print(array, "#1")
